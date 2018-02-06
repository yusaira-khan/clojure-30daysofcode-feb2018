(use '[clojure.string :only (split triml)])

(defn factorial [n acc](
    if (<= n 1) 
    (println acc)
    (recur (- n 1 ) (* n acc) ) ))
(
    let [
      n_t (read-line) 
      n (Integer/parseInt n_t) 
    ]
     (factorial n 1)

)
