(ns problems-4clj.core)



;; problem 20 (Easy)
(def penultimate-element-solution
  ;; a function which returns the second to last element from a sequence.
  (comp second reverse))


;; problem 24 (Easy)
(def sum-it-all-up-solution
  ;; Write a function which returns the sum of a sequence of numbers.
  (fn [ns] ;; update args as needed
     (reduce + 0 ns )))


;; problem 25 (Easy)
(def find-the-odd-numbers-solution
  ;; write a function which returns only the odd numbers from a sequence.
  (partial filter odd?
    ))


;; problem 27 (Easy)
(def palindrome-detector-solution
  ;; Write a function which returns true if the given sequence is a palindrome.
  ;;
  ;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
  (fn [coll]
    (= (seq coll) (reverse coll))))

;; problem 32 (Easy)
(def duplicate-a-sequence-solution
  ;; Write a function which duplicates each element of a sequence.
  (partial reduce #(conj %1 %2 %2) []))
