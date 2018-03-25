(ns canary.projects.lumo
  (:require [canary.runner.travis :as travis]))

(defn ^:task lumo [options]
  (travis/request-build! "anmonteiro/lumo" "CANARY_LUMO_TRAVIS_TOKEN" options))