(ns clojure-talk.sets)

(def our-set #{1 2 3})

(conj our-set 4) ; => #{1 2 3 4}

(disj our-set 2) ; => #{1 3}

(get our-set 2) ; => 2

(get our-set 5 :some-default) ; => :some-default
