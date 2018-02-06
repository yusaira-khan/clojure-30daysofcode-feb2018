(use '[clojure.string :only (split triml)])

(
        let [
          n_t (read-line) 
          n (Integer/parseInt n_t)
          ones  (range 1 11)
          nums  (range n (* 11 n) n)
        ]
        (defn printboth [_o _n] (println (str n_t  " x " (str _o) " = "(str _n)) ) )
          
        (doall (map printboth ones nums))
        
)
