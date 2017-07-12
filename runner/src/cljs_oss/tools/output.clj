(ns cljs-oss.tools.output
  (:require [clojure.java.io :as io])
  (:import (java.util.concurrent TimeUnit)
           (java.io BufferedReader)))

; -- line-based streaming ---------------------------------------------------------------------------------------------------

(defn print-stream-as-lines! [stream printer]
  (future
    (let [output (io/reader stream)]
      (loop []
        (when-some [out (.readLine ^BufferedReader output)]
          (printer out)
          (recur))))))

; -- flushing ---------------------------------------------------------------------------------------------------------------

(defn flush-outputs! []
  ; TODO: how to make sure our piped writers get properly flushed?
  (.flush *out*)
  (.flush *err*)
  (.sleep TimeUnit/SECONDS 1))
