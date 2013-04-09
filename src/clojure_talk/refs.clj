(ns clojure-talk.refs)

(def total-value  (ref 0))
(def savings      (ref 100))

(defn add [i]
  (dosync
    (alter total-value + i)))

(defn transfer [i]
  (dosync
    (when (>= @savings i)
      (alter savings - i)
      (alter total-value + i))))

(defn transfer-slow [i]
  (dosync
    (when (>= @savings i)
      (alter savings - i)
      (Thread/sleep 3000)
      (alter total-value + i))))

; ---

(defn watch-values
  []
  (loop []
    (print "\r")
    (print "total-value: " (pr-str @total-value) "savings: " (pr-str @savings))
    (.flush *out*)
    (Thread/sleep 1000)
    (recur)))