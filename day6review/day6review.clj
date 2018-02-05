(use '[clojure.string :only (split triml)])
;incomplete
(
        let [
          n_t (read-line) 
          n (Integer/parseInt n_t)
        ]
        (defn printpart [acc] 
        (if (< acc n)
            (let [ a  (map-indexed vector (read-line))]
            (println a )
            (recur (+ 1 acc))
        )))
        (printpart 0)

)
