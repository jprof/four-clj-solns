(ns four-clj-solns.core-test
  (:require [clojure.test :refer :all]
            [four-clj-solns.core :refer :all]))

(deftest prob-30-tests
  (testing "Problem 30 - Compress a Sequence"
    (is (= (compress-seq [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
    (is (= (apply str (compress-seq "Leeeeeeerroyyy")) "Leroy"))
    (is (= (compress-seq [[1 2] [1 2] [3 4] [1 2]])))))

(deftest prob-46-tests
  (testing "Problem 46 - Flipping out"
    (is (= 3 ((flip-out nth) 2 [1 2 3 4 5])))
    (is (= true ((flip-out >) 7 8)))
    (is (= 4 ((flip-out quot) 2 8)))
    (is (= [1 2 3] ((flip-out take) [1 2 3 4 5] 3)))))

(deftest prob-92-tests
  (testing "Problem 92 - Read Roman Numerals"
    (is (= 14   (read-roman-nums "XIV")))
    (is (= 827  (read-roman-nums "DCCCXXVII")))
    (is (= 3999 (read-roman-nums "MMMCMXCIX")))
    (is (= 48   (read-roman-nums "XLVIII"))))
  )

(deftest prob-93-tests
  (testing "Problem 93 - Partially flatten a sequence"
    (is (= (part-flatten-seq [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]]))
    (is (= (part-flatten-seq [[[:a :b]] [[:c :d]] [:e :f]]) [[:a :b] [:c :d] [:e :f]]))
    (is (= (part-flatten-seq '((1 2) ((3 4)) (((((5 6))))))) '((1 2) (3 4) (5 6))))
    (is (= (part-flatten-seq []) [])))
  )

(deftest prob-105-tests
  (testing "Problem 92 - Identify keys and values"
    (is (= (id-keys-and-values [:a 1])      {:a [1]}))
    (is (= (id-keys-and-values [:a 1 :b 2]) {:a [1] :b [2]}))
    (is (= (id-keys-and-values [:a 1 2 3 :b :c 4]) {:a [1 2 3] :b [] :c [4]}))
    (is (= (id-keys-and-values []) {}))))

