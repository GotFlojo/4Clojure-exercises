(ns problems-4clj.core-test
  (:require [clojure.test :refer :all]
            [problems-4clj.core :refer :all]))





;; problem 13
(deftest can-sequences-rest
  (is (= sequences-rest-solution (rest [10 20 30 40]))))


;; problem 14
(deftest can-intro-to-functions
  (is (= intro-to-functions-solution ((fn add-five [x] (+ x 5)) 3)))
  (is (= intro-to-functions-solution ((fn [x] (+ x 5)) 3)))
  (is (= intro-to-functions-solution (#(+ % 5) 3)))
  (is (= intro-to-functions-solution ((partial + 5) 3))))


;; problem 15
(deftest can-double-down
  (is (= (double-down-solution 2) 4))
  (is (= (double-down-solution 3) 6))
  (is (= (double-down-solution 11) 22))
  (is (= (double-down-solution 7) 14)))


;; problem 16
(deftest can-hello-world
  (is (= (hello-world-solution "Dave") "Hello, Dave!"))
  (is (= (hello-world-solution "Jenn") "Hello, Jenn!"))
  (is (= (hello-world-solution "Rhea") "Hello, Rhea!")))


;; problem 17
(deftest can-sequences-map
  (is (= sequences-map-solution (map #(+ % 5) '(1 2 3)))))


;; problem 18
(deftest can-sequences-filter
  (is (= sequences-filter-solution (filter #(> % 5) '(3 4 5 6 7)))))


;; problem 35
(deftest can-local-bindings
  (is (= local-bindings-solution (let [x 5] (+ 2 x))))
  (is (= local-bindings-solution (let [x 3, y 10] (- y x))))
  (is (= local-bindings-solution (let [x 21] (let [y 3] (/ x y))))))


;; problem 36
;; (deftest can-let-it-be
;;   (is (= 10 (let let-it-be-solution (+ x y))))
;;   (is (= 4 (let let-it-be-solution (+ y z))))
;;   (is (= 1 (let let-it-be-solution z))))
