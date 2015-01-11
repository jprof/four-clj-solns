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

;; Problem #46 - Flipping out
(def flip-out
  (fn [to-flip]
    (fn [& args]
      (apply to-flip (reverse args)))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
