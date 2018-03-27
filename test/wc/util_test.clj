(ns wc.util-test
  (:require [clojure.test :refer :all]
            [wc.util :refer :all]))

(deftest is-option-test
  (testing "should pass when argument is an option"
    (is (isOption "-abc"))))

(deftest is-option-test
  (testing "should fail when argument is not an option"
    (is (not (isOption "abc")))))

(deftest filter-not-option-test
  (testing "should return list of arguments which are not option"
    (is (= (filter-not-option '("-abc" "abc" "-a" "a" "b" "-b")) '("abc" "a" "b")))))
