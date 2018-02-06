(use '[clojure.string :only (split triml)])
(
    let [
      n_t (read-line) 
      n (Integer/parseInt n_t) 
      arr_temp (read-line) 
      arr_t (split arr_temp #"\s+") 
      arr (map #(Integer/parseInt %) arr_t) 
    ]
    (println arr)
    (defn rev2 [l acc] ( 
        if (nil? (last l))
            acc
            (recur (butlast l) (conj acc (last l)))))
    (println (clojure.string/join " "(rev2 arr []))) 
)
