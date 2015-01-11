(ns four-clj-solns.core
  (:require [clojure.string])
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

;; Problem #92 - Read Roman Numerals
(def read-roman-nums
  (fn [s]
    (let [NUMS {\I 1
                \V 5
                \X 10
                \L 50
                \C 100
                \D 500
                \M 1000}
          new-s (-> s
                    (clojure.string/replace #"IV" "IIII")
                    (clojure.string/replace #"IX" "VIIII")
                    (clojure.string/replace #"XL" "XXXX")
                    (clojure.string/replace #"XC" "LXXXX")
                    (clojure.string/replace #"CD" "CCCC")
                    (clojure.string/replace #"CM" "DCCCC"))]
      (reduce #(+ %1 %2) (map #(get NUMS %) new-s)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
