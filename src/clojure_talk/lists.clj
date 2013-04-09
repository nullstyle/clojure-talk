(ns clojure-talk.lists)

(def our-list '(1 2 3))

(conj our-list 4) ; => (4 1 2 3)

(rest our-list) ; => (2 3)

(first our-list) ; => 1