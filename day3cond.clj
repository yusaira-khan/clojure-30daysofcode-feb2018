(use '[clojure.string :only (split triml)])

(
        let [
          N_t (read-line) 
          N (Integer/parseInt N_t) 
          W "Weird"
          NW "Not Weird"
        ]
    (if (odd? N) (println W)
        (if (<= 2 N 5) (println NW)
            (if ( > N 20 ) (println NW) (println W)
                    )))
)
