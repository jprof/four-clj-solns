(ns four-clj-solns.core
  (:gen-class))

;; Problem #30 - Compress a Sequence
(def compress-seq
  (fn [s]
    (loop [coll (list (first s))
           remaining (rest s)]
      (let [f-remaining (first remaining)
            f-coll (first coll)]
        (if (seq remaining)
          (recur
            (if (= f-remaining f-coll)
              coll
              (conj coll f-remaining))
            (rest remaining))
          (reverse coll))))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
