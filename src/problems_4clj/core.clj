(ns problems-4clj.core)



;; problem 13 (Elementary)
(def sequences-rest-solution
  ;; The rest function will return all the items of a sequence except the first.
  [20 30 40])


;; ;; problem 14 (Elementary)
(def intro-to-functions-solution
  8)


;; ;; problem 15 (Elementary)
(def double-down-solution
  (fn [n] ;; update args as needed
  ;; Write a function which doubles a number.
  (* 2 n)))


;; ;; problem 16 (Elementary)
(def hello-world-solution
  (fn [args] ;; update args as needed
  ;; Write a function which returns a personalized greeting.
    (str "Hello, " args "!")))


;; ;; problem 17 (Elementary)
(def sequences-map-solution
  ;; The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.
  '(6 7 8))


;; ;; problem 18 (Elementary)
(def sequences-filter-solution
  '(6 7))


;; ;; problem 35 (Elementary)
(def local-bindings-solution
  7 )


;; ;; problem 36 (Elementary)
(def let-it-be-solution
  ['z 1 'y 3 'x 7])
