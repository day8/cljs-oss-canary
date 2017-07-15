(ns canary.runner
  "Command-line interface and the main entry point."
  (:require [clojure.string :as string]
            [clojure.tools.cli :as cli]
            [canary.runner.jobs :as jobs]
            [canary.runner.utils :as utils]
            [canary.runner.cli :refer [timeout-cli-option normal-cli-option verbosity-cli-option]]
            [canary.runner.output :as output]
            [canary.runner.i18n :as i18n]
            [me.raynes.fs :as fs])
  (:gen-class))

(def default-compiler-rev "master")
(def default-compiler-repo "https://github.com/clojure/clojurescript.git")
(def default-projects-dir "src/canary/projects")
(def default-work-dir ".workdir")
(def default-timeout (utils/seconds-to-msec (* 60 60)))                                                                       ; 60min
(def default-polling-interval (utils/seconds-to-msec (* 60 5)))                                                               ; 5min, travis kills a job when no output is presented in last 10min

(def cli-options
  [(normal-cli-option
     ["-r" "--compiler-rev REV" "Pin ClojureScript compiler to specific revision" :default default-compiler-rev])
   (normal-cli-option
     [nil "--compiler-repo URL" "Git repo to fetch compiler sources from" :default default-compiler-repo])
   (normal-cli-option
     ["-p" "--projects DIR" "Path to projects directory" :default default-projects-dir])
   (normal-cli-option
     [nil "--workdir DIR" "Path to working directory" :default default-work-dir])
   (normal-cli-option
     [nil "--only SUBSTR" "Run only tasks matching a substring"])
   (normal-cli-option
     [nil "--job-id ID" "Optional job id" :default "test"])
   (timeout-cli-option
     [nil "--polling-interval SECONDS" "Polling interval for job status (in seconds)" :default default-polling-interval])
   (timeout-cli-option
     [nil "--timeout SECONDS" "Total timeout for job to complete (in seconds)" :default default-timeout])
   (normal-cli-option
     [nil "--production" "Will not commit into results branch"])
   (normal-cli-option
     ["-t" "--test" "Do not launch any tasks. Useful for testing which task will be executed."])
   (verbosity-cli-option
     ["-v" nil "Verbosity level; may be specified multiple times"])
   (normal-cli-option
     ["-h" "--help"])])

(defn exit! [status & [msg]]
  (if (some? msg)
    (println msg))
  (output/flush-outputs!)
  (System/exit status))

(defn expand-paths [options]
  (assoc options
    :projects (utils/canonical-path (:projects options))
    :workdir (utils/canonical-path (:workdir options))))

(defn prevent-verbose-mode-in-production [options]
  (if (and (:production options) (pos? (:verbosity options)))
    (do
      (println (str "Note: Verbose mode is not allowed in production because it could leak secret env variables. "
                    "Using non-verbose mode instead."))
      (assoc options :verbosity 0))
    options))

(defn sanitize-options [options]
  (-> options
      (expand-paths)
      (prevent-verbose-mode-in-production)))

(defn validate-options [options]
  (let [projects-dir (:projects options)
        issues (cond-> []
                       (not (fs/exists? projects-dir)) (conj (i18n/projects-dir-not-exists-msg projects-dir))
                       (and (fs/exists? projects-dir)
                            (or (not (fs/directory? projects-dir))
                                (not (fs/readable? projects-dir)))) (conj (i18n/projects-dir-not-dir-msg projects-dir)))]
    (if-not (empty? issues)
      issues)))

(defn run-job! [options]
  (let [sanitized-options (sanitize-options options)
        validation-errors (validate-options sanitized-options)]
    (if (some? validation-errors)
      (exit! 2 (i18n/cli-validation-msg validation-errors))
      (jobs/run! sanitized-options))))

; -- main entry point -------------------------------------------------------------------------------------------------------

(defn -main [& args]
  (let [{:keys [options errors summary]} (cli/parse-opts args cli-options)]
    (cond
      errors (exit! 1 (i18n/cli-errors-msg errors))
      (:help options) (exit! 0 (i18n/cli-usage summary))
      :else (exit! (run-job! options)))))
