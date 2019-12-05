(ns problems-4clj.core-test
  (:require [clojure.test :refer :all]
            [problems-4clj.core :refer :all]))




;; problem 3
(deftest can-intro-to-strings
  (is (= intro-to-strings-solution (.toUpperCase "hello world"))))
