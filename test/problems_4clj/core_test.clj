(ns problems-4clj.core-test
  (:require [clojure.test :refer :all]
            [problems-4clj.core :refer :all]))





;; problem 37
(deftest can-regular-expressions
  (is (= regular-expressions-solution (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))))


;; ;; problem 57
(deftest can-simple-recursion
  (is (= simple-recursion-solution ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))))


;; ;; problem 68
(deftest can-recurring-theme
  (is (= recurring-theme-solution
  (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result)))))


;; ;; problem 71
(deftest can-rearranging-code->
  (is (= (rearranging-code->-solution (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (rearranging-code->-solution))
   5)))


;; ;; problem 72
(deftest can-rearranging-code->>
  (is (= (rearranging-code->>-solution (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
   (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (rearranging-code->>-solution))
   11)))


;; ;; problem 145
(deftest can-for-the-win
  (is (= for-the-win-solution (for [x (range 40)
            :when (= 1 (rem x 4))]
        x)))
  (is (= for-the-win-solution (for [x (iterate #(+ 4 %) 0)
            :let [z (inc x)]
            :while (< z 40)]
        z)))
  (is (= for-the-win-solution (for [[x y] (partition 2 (range 20))]
        (+ x y)))))
