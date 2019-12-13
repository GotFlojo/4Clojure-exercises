(ns problems-4clj.core-test
  (:require [clojure.test :refer :all]
            [problems-4clj.core :refer :all]))



;; problem 20
(deftest can-penultimate-element
  (is (= (penultimate-element-solution (list 1 2 3 4 5)) 4))
  (is (= (penultimate-element-solution ["a" "b" "c"]) "b"))
  (is (= (penultimate-element-solution [[1 2] [3 4]]) [1 2])))


;; problem 24
(deftest can-sum-it-all-up
  (is (= (sum-it-all-up-solution [1 2 3]) 6))
  (is (= (sum-it-all-up-solution (list 0 -2 5 5)) 8))
  (is (= (sum-it-all-up-solution #{4 2 1}) 7))
  (is (= (sum-it-all-up-solution '(0 0 -1)) -1))
  (is (= (sum-it-all-up-solution '(1 10 3)) 14)))


;; problem 25
(deftest can-find-the-odd-numbers
  (is (= (find-the-odd-numbers-solution #{1 2 3 4 5}) '(1 3 5)))
  (is (= (find-the-odd-numbers-solution [4 2 1 6]) '(1)))
  (is (= (find-the-odd-numbers-solution [2 2 4 6]) '()))
  (is (= (find-the-odd-numbers-solution [1 1 1 3]) '(1 1 1 3))))


;; problem 27
(deftest can-palindrome-detector
  (is (false? (palindrome-detector-solution '(1 2 3 4 5))))
  (is (true? (palindrome-detector-solution "racecar")))
  (is (true? (palindrome-detector-solution [:foo :bar :foo])))
  (is (true? (palindrome-detector-solution '(1 1 3 3 1 1))))
  (is (false? (palindrome-detector-solution '(:a :b :c)))))


;; problem 32
(deftest can-duplicate-a-sequence
  (is (= (duplicate-a-sequence-solution [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (duplicate-a-sequence-solution [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))
