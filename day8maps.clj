(use '[clojure.string :only (split triml)])
(defn getnames [n idx mapp] (
        if (< idx  n)
            ( recur n (+ idx 1) ( 
                merge mapp
                    ( apply hash-map 
                      (.split (read-line) " "))))
        mapp
    ))
(defn printname [mapp] 
    (
        let [
             l (read-line) 
            v (get mapp l)
        ]
        (if (not(empty? l))
            (do 
                (if (nil? v) 
                    (println "Not found")
                    (println (str l "=" v)))
                (recur mapp))
        )))
(
    let [
      n_t (read-line) 
      n (Integer/parseInt n_t) 
      mapp (getnames n 0 {})
    ]
    
    ; (println mapp)
    (printname mapp)
)

