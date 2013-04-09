(ns clojure-talk.vectors)

(def our-vec [1 2 3])

(conj our-vec 4) ; => [ 1 2 3 4 ]

(get our-vec 1) ; => 2

(pop our-vec) ; => [1 2]


(subvec our-vec 1) ; => [2 3]