(ns bls.core
  (:require [[clojure.string :as string]])
  (:gen-class))


;; Generate a balanced Latin square
;; Take a single positive integer argument, the number of conditions (n)
;; When n is even
;;   make the first row using the formula row1 = 1,2,n,3,n-1,n-2
;;   fill in the first column sequentially (mod n)
;;   continue filling in the columns sequentially until the square is completed
;; When n is odd
;;   follow the above procedure for n even
;;    create a second set of rows with with reversed contents of every row
(defn generate-bls
  [n]
  (let  [bls (bls-even n)]
    (cond
      (even? n) bls
      :else (concat bls (map reverse bls)))))

(defn bls-even
  [n]
  (for [row (range n)]
      (bls-row row n)))

(defn bls-row
  [row n]
  (for [col (range n)] (bls-val row col n)))
  
(defn bls-val
  [row col n]
  (+ (mod (+ (even-odd col n) row) n) 1))

(defn even-odd
  [col n]
  (cond
    (even? col) (- n (quot col 2))
    :else (+ (quot col 2) 1)))


(defn validate-args
  "validate command-line arguments: there must be a single positive integer argument"
  [args]
  (if (= 1 (count args))
    (let [n 
          (try (Integer/parseInt (first args))
               (catch Exception e nil))]
      (cond
        (nil? n) nil
        :else n))
    nil))
   

(defn -main
  "generate a balanced Latin square"
  [& args]
  (let [n (validate-args args)]
    (cond
      (nil? n)(println "usage: requires a single positive integer argument")
      :else (generate-bls n))))

