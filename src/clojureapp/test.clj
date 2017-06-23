(if (< 2 5)
  100
  15)

(when (> 5 2)
  5)

;;**************
(def m "v1")
(case m
  "v1" true
  "v2" false
  15)

;;**************
(def x 5)
(cond
  (> x 5) :s
  (< x 5) :5
  :else 5)

;;**************
(do
  1
  (println "123")
  3)

;;**************
;;
(when true
  (println "123")
  :no)

;;**************







