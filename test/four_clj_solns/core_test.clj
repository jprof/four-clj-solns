(ns four-clj-solns.core-test
  (:require [clojure.test :refer :all]
            [four-clj-solns.core :refer :all]))

(deftest prob-30-tests
  (testing "Problem 30 - Compress a Sequence"
    (= (compress-seq [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
    (= (apply str (compress-seq "Leeeeeeerroyyy")) "Leroy")
    (= (compress-seq [[1 2] [1 2] [3 4] [1 2]]))))

(deftest prob-46-tests
  (testing "Problem 46 - Flipping out"
    (= 3 ((flip-out nth) 2 [1 2 3 4 5]))
    (= true ((flip-out >) 7 8))
    (= 4 ((flip-out quot) 2 8))
    (= [1 2 3] ((flip-out take) [1 2 3 4 5] 3))))
