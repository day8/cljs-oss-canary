(ns canary.runner.tasks
  "Tools for working with clojure tasks."
  (:require [clojure.string :as string]
            [canary.runner.defaults :as defaults]))

(defn task-passed? [task]
  (= (get-in task [:result :status]) :passed))

(defn var-task? [var]
  (assert (var? var))
  (true? (:task (meta var))))

(defn var-fn? [var]
  (assert (var? var))
  true)

(defn public-vars [namespace]
  (vals (ns-publics namespace)))

(defn scan-tasks [namespace]
  (->> (public-vars namespace)
       (filter var-task?)
       (filter var-fn?)))

(defn set-positive-filter [task]
  (assoc task :enabled true
              :enabled-reason "enabled by default"))

(defn set-negative-filter [task]
  (assoc task :enabled false
              :enabled-reason "disabled because not matching --only or --include options"))

(defn filter-via-only [task only]
  (let [task-name (:name task)
        candidates (string/split only #"\s+")
        match (some #(if (.contains task-name %) %) candidates)]
    (if match
      (assoc task :enabled true
                  :enabled-reason (if (not= match only)
                                    (str "enabled because matching '" match "' via --only '" only "'")
                                    (str "enabled because matching --only '" only "'")))
      task)))

(defn filter-via-except [task except]
  (let [task-name (:name task)
        candidates (string/split except #"\s+")
        match (some #(if (.contains task-name %) %) candidates)]
    (if match
      (assoc task :enabled false
                  :enabled-reason (if (not= match except)
                                    (str "disabled because matching '" match "' via --except '" except "'")
                                    (str "disabled because matching --except '" except "'")))
      task)))

(defn filter-via-include [task include]
  (let [task-name (:name task)
        matching? (some? (re-matches (re-pattern include) task-name))]
    (if matching?
      (assoc task :enabled true
                  :enabled-reason (str "enabled because matching regex --include '" include "'"))
      task)))

(defn filter-via-exclude [task exclude]
  (let [task-name (:name task)
        matching? (some? (re-matches (re-pattern exclude) task-name))]
    (if matching?
      (assoc task :enabled false
                  :enabled-reason (str "disabled because matching regex --exclude '" exclude "'"))
      task)))

(defn task-filter [options task]
  (let [{:keys [only except include exclude]} options]
    ; note that the order is important here, exclusion filters go after inclusion filters
    (cond-> (set-positive-filter task)
            (or (some? only) (some? include)) (set-negative-filter)
            (some? only) (filter-via-only only)
            (some? include) (filter-via-include include)
            (some? except) (filter-via-except except)
            (some? exclude) (filter-via-exclude exclude))))

(defn assign-task-colors [tasks]
  (map #(assoc %1 :color %2) tasks defaults/palette))

(defn enable-tasks-based-on-options [tasks options]
  (map (partial task-filter options) tasks))

(defn sort-enabled-tasks-first [tasks]
  (let [swap? (fn [task1 task2] (and (:enabled task2) (not (:enabled task1))))]
    (sort (comparator swap?) tasks)))

(defn sort-tasks-by-priority [tasks]
  (let [swap? (fn [task1 task2]
                (let [task1-priority (or (:priority task1) -1)
                      task2-priority (or (:priority task2) -1)]
                  (< task1-priority task2-priority)))]
    (sort (comparator swap?) tasks)))

(defn sort-tasks-by-name [tasks]
  (sort-by :name tasks))

(defn sort-tasks [tasks]
  (-> tasks
      (sort-tasks-by-name)
      (sort-tasks-by-priority)
      (sort-enabled-tasks-first)))

(defn analyze-tasks [tasks options]
  (-> tasks
      (enable-tasks-based-on-options options)
      (sort-tasks)
      (assign-task-colors)))

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (do
    (require 'canary.projects.binaryage)
    (scan-tasks 'canary.projects.binaryage)))