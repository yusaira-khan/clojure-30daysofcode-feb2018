(use '[clojure.string :only (split triml)])

(
    let [
      n_t (read-line) 
      n (Integer/parseInt n_t)
    ]
    (defn oddfirst? [x]
        (odd? (first x)))
    (defn evenfirst? [x]
        (even? (first x)))
    (defn printpart [acc] 
        (if (< acc n)
            (let [
                  line  (map-indexed vector (read-line))
                  odds (filter oddfirst? line)
                  evens (filter evenfirst? line)
                  oddletters (map peek odds)
                  evenletters (map peek evens)
                  ]
            (println 
                (str (clojure.string/join evenletters)
                    " " (clojure.string/join oddletters)))
            (recur (+ 1 acc)))))
    (printpart 0)
)
