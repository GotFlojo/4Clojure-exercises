(ns problems-4clj.core-test
  (:require [clojure.test :refer :all]
            [clojure.set]
            [problems-4clj.core :refer :all]))




;; problem 3
(deftest can-intro-to-strings
  (is (= intro-to-strings-solution (.toUpperCase "hello world"))))


;; problem 4
(deftest can-intro-to-lists
  (is (= intro-to-lists-solution '(:a :b :c))))


;; problem 5
(deftest can-lists-conj
  (is (= lists-conj-solution (conj '(2 3 4) 1)))
  (is (= lists-conj-solution (conj '(3 4) 2 1))))


;; problem 6
(deftest can-intro-to-vectors
  (is (= (intro-to-vectors-solution) (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))


;; problem 7
(deftest can-vectors-conj
  (is (= vectors-conj-solution (conj [1 2 3] 4)))
  (is (= vectors-conj-solution (conj [1 2] 3 4))))


; problem 8
(deftest can-intro-to-sets
  (is (= intro-to-sets-solution (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= intro-to-sets-solution (clojure.set/union #{:a :b :c} #{:b :c :d}))))


; problem 9
(deftest can-sets-conj
  (is (= #{1 2 3 4} (conj #{1 4 3} sets-conj-solution))))


; problem 10
(deftest can-intro-to-maps
  (is (= intro-to-maps-solution ((hash-map :a 10, :b 20, :c 30) :b)))
  (is (= intro-to-maps-solution (:b {:a 10, :b 20, :c 30}))))


; problem 11
(deftest can-maps-conj
  (is (= {:a 1, :b 2, :c 3} (conj {:a 1} maps-conj-solution [:c 3]))))


; problem 12
(deftest can-intro-to-sequences
  (is (= intro-to-sequences-solution (first '(3 2 1))))
  (is (= intro-to-sequences-solution (second [2 3 4])))
  (is (= intro-to-sequences-solution (last (list 1 2 3)))))
