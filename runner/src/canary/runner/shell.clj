(ns canary.runner.shell
  "High-level utils for working with shell."
  (:require [me.raynes.conch.low-level :as sh]
            [me.raynes.fs :as fs]
            [canary.runner.output :as output]
            [canary.runner.print :refer [announce]]
            [canary.runner.utils :as utils]
            [canary.runner.i18n :as i18n]
            [clojure.java.io :as io])
  (:import (java.io InputStream)))

(def max-output-buffer 1000000)

; -- helpers ----------------------------------------------------------------------------------------------------------------

(defn mark-stream! [^InputStream stream & [max-buffer]]
  (assert (.markSupported stream))
  (.mark stream (or max-buffer max-output-buffer)))

(defn reset-stream! [^InputStream stream]
  (assert (.markSupported stream))
  (.reset stream))

(defn stream-proc-output! [proc]
  (output/print-stream-as-lines! (:out proc) output/synchronized-out-printer)
  (output/print-stream-as-lines! (:err proc) output/synchronized-err-printer))

(defn mark-proc-output! [proc]
  (mark-stream! (:out proc))
  (mark-stream! (:err proc)))

(defn determine-workdir-for-task [task options]
  (let [job-slug (utils/sanitize-as-filename (or (:job-id options) "_local-job"))
        task-slug (utils/sanitize-as-filename (:name task))
        task-workdir (str (:workdir options) "/" "jobs" "/" job-slug "/" "tasks" "/" task-slug)]
    task-workdir))

(defn ensure-clean-workdir! [path]
  (when (fs/exists? path)
    (assert (fs/directory? path))
    (fs/delete-dir path))
  (fs/mkdirs path))

(defn prepare-workdir! [task options]
  (let [workdir-path (determine-workdir-for-task task options)]
    (ensure-clean-workdir! workdir-path)
    workdir-path))

(defn reset-proc-stream! [proc which]
  (let [stream (proc which)]
    (reset-stream! stream)
    stream))

(defn extract-outputs! [result proc]
  (let [rewind-proc (partial reset-proc-stream! proc)]
    (assoc result
      :out (sh/stream-to-string rewind-proc :out)
      :err (sh/stream-to-string rewind-proc :err))))

; -- main api ---------------------------------------------------------------------------------------------------------------

(defn make-shell-launcher [file & [env]]
  (let [path (str file)
        name (.getName file)]
    (fn [options]
      (let [task (meta options)]
        (let [workdir (prepare-workdir! task options)
              proc (sh/proc path :verbose false :dir workdir :env env)]
          (mark-proc-output! proc)
          (stream-proc-output! proc)
          (let [status (sh/exit-code proc)]
            (announce (i18n/shell-task-exit-code name status) 2 options)
            (-> {:exit-code status}
                (extract-outputs! proc))))))))

(defn launch! [cmd args & [options]]
  (let [proc (apply sh/proc cmd args)]
    (mark-proc-output! proc)
    (when (:stream-output options)
      (stream-proc-output! proc))
    (let [status (sh/exit-code proc)]
      (-> {:exit-code status}
          (extract-outputs! proc)))))
