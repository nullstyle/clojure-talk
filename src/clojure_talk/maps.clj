(ns clojure-talk.maps)

(def our-map { :foo 1 :bar 2 :baz 3})

(assoc our-map :bak 4) ; => {:foo 1, :bar 2, :bak 4, :baz 3}

(dissoc our-map :foo) ; => {:bar 2, :baz 3}

(:foo our-map) ; => 1

