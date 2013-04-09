(ns clojure-talk.atoms)

(def total-value (atom 0))

(defn add [i]
  (swap! total-value + i))

(defn add-if [check i]
  (compare-and-set! total-value check (+ check i)))

;---

(defn watch-values
  []
  (loop []
    (print "\r")
    (print "total-value: " (pr-str @total-value))
    (.flush *out*)
    (Thread/sleep 1000)
    (recur)))