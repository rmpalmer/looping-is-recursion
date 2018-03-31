(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc base n]
                 (if (zero? n)
                   acc
                   (recur (* acc base) base (dec n)))
                 )]
    (helper 1 base exp)))

(defn last-element [a-seq]
  (let [helper (fn [x a-seq]
                 (if (empty? a-seq)
                   x
                   (recur (first a-seq) (rest a-seq))))]
  (helper nil a-seq)))

(defn seq= [seq1 seq2]
  (let [helper (fn [s1 s2]
                 (if (not (= (first s1) (first s2))) false
                   (recur (rest s1) (rest s2))))
        l1 (count seq1)
        l2 (count seq2)]
    (if (not (= l1 l2)) false (helper seq1 seq2))))

(seq= [] [])

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

