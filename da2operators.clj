(use '[clojure.string :only (split triml)])

(
    let [
      meal_cost_t (read-line) 
      meal_cost (Float/parseFloat meal_cost_t) 
    
      tip_percent_t (read-line) 
      tip_percent (Integer/parseInt tip_percent_t) 
    
      tax_percent_t (read-line) 
      tax_percent (Integer/parseInt tax_percent_t) 
      
      meal_perc (* meal_cost 0.01)
      
      tip (* meal_perc tax_percent)
      tax (* meal_perc tip_percent)
      total (Math/round (+ meal_cost (+ tax tip)))
    ]
  
(println (str "The total meal cost is " (str total) " dollars."))

)
