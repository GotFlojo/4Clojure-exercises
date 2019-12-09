(ns problems-4clj.core)


;; problem 37 (Elementary)
(def regular-expressions-solution
  "ABC")


;; problem 57 (Elementary)
(def simple-recursion-solution
  '(5 4 3 2 1))


;; problem 68 (Elementary)
(def recurring-theme-solution
  [7 6 5 4 3])


;; problem 71 (Elementary)
(def rearranging-code->-solution
  last)


;; problem 72 (Elementary)
(def rearranging-code->>-solution
  (fn [nums] 
  ;; The ->> macro threads an expression x through a variable number of forms. First, x is inserted as the last item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the last item in the second form, making a list of that form if necessary. This process continues for all the forms. Using ->> can sometimes make your code more readable.
  (apply + nums)))


;; problem 145 (Elementary)
(def for-the-win-solution
  '(1 5 9 13 17 21 25 29 33 37))
