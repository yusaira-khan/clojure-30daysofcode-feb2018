(clojure.pprint/pprint
  (map vector
    (range 25)
    (cycle [:fizz :_ :_])
    (cycle [:buzz :_ :_ :_ :_])))
    
(do
  (println "What's your name?")
  (let [name (read-line)]
    (println (str "Hey, " name))))
