(ns problems-4clj.core)

;; problem 3 (Elementary)
(def intro-to-strings-solution
  "HELLO WORLD")


;; problem 4 (Elementary)
(def intro-to-lists-solution
  (list :a :b :c))


;; problem 5 (Elementary)
(def lists-conj-solution
  ;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.
  ;;  Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.
  '(1 2 3 4))


;; problem 6 (Elementary)
(def intro-to-vectors-solution
  ;; Vectors can be constructed several ways. You can compare them with lists.
  ;; 
  ;; 
  ;; Note: the brackets [] surrounding the blanks __ are part of the test case.
 (fn []
   [:a :b :c])) 


;; problem 7 (Elementary)
(def vectors-conj-solution
  ;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
 [1 2 3 4])


;; problem 8 (Elementary)
(def intro-to-sets-solution
  ;; Sets are collections of unique values.
  #{:a :b :c :d})


;; problem 9 (Elementary)
(def sets-conj-solution
  ;; When operating on a set, the conj function returns a new set with one or more keys "added".
  2)


;; problem 10 (Elementary)
(def intro-to-maps-solution
  ;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
  20)


;; problem 11 (Elementary)
(def maps-conj-solution
  ;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
  {:a 1, :b 2})


;; problem 12 (Elementary)
(def intro-to-sequences-solution
  ;; All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last.
  3)
