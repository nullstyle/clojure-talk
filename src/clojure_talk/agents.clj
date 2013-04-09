(ns clojure-talk.agents)

(def total-value (agent 0))

(defn add [i]
  (send total-value + i))

(defn add-slow [i]
  (send-off total-value #(do (Thread/sleep 5000) (+ %1 %2)) i))


;---

(defn watch-values
  []
  (loop []
    (print "\r")
    (print "total-value: " (pr-str @total-value))
    (.flush *out*)
    (Thread/sleep 1000)
    (recur)))