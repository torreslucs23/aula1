(ns aula1.core
  (:gen-class))



;;; colar aqui as funções
(defn sucessor
  "Retorna o sucessor de um número"
  [n]
  (inc n))

(defn antecessor
  "Retorna o antecessor de um número"
  [n]
  (dec n))

(defn soma
  "Soma dois números"
  [a
   b]
  (+ a b))

(defn sub
  "Subtrai dois números"
  [a
   b]
  (- a b))

(defn mult
  "Multiplica dois números"
  [a b]
  (* a b))

(defn div
  "Divide dois números"
  [a
   b]
  (/ a b))

(defn maior?
  "Retorna true se for maior de idade, false caso contrário"
  [idade]
  (if (>= idade 18)
  true
  false))

(defn menor?
  "Retorna true se for menor de idade, false caso contrário"
  [idade]
  (if(< idade 18)
  true
  false ))

(defn baixo?
  "Retorna true se a altura for menor que 1.6 metros, false caso contrário"
  [altura]
  (if (< altura 1.6)
  true
  false))

(defn alto?
  "Retorna true se a altura for maior que 1.8 metros, false caso contrário"
  [altura]
  (if (>= altura 1.8)
  true
  false))

(defn medio?
  "Retorna true se a idade estiver entre 1.6 e 1.8 metros, false caso contrário"
  [altura]
  (if (and (>= altura 1.6) (<= altura 1.8))
  true
  false))

(defn par?
  "Retorna true se o número for par, false caso contrário."
  [n]
  (if (= (mod n 2 ) 0)
  true
  false))

(defn impar?
  "Retorna true se o número for ímpar, true caso contrário."
  [n]
  (if (not= (mod n 2 ) 0)
  true
  false))


;;; Definindo uma variável
;;; Em clojure, variável tem o mesmo significado da matemática

(def PI 3.1415)

(defn round
  [precision d]
  (let [factor (Math/pow 10 precision)]
    (/ (Math/round (* d factor)) factor)))


(defn area-circ
  "Recebe um raio e calcula a área da circunferência."
  [raio]
  ( round 2 (* PI (* raio raio))))

  (defn absolute
  "Recebe um numero e transforma ele em absoluto"
  [n]
  (if (< n 0)
  (* n -1)
  n))

(defn eh-triangulo?
  "Recebe 3 lados e verifica se formam um triângulo de acordo com as regras do slide 34."
  [a b c]
  (if ( and (< (absolute (- b c)) a (+ b c))
          (< (absolute (- a c)) c (+ a c))
          (< (absolute (- a b)) c (+ a b)))
    true
    false))

(defn novo-salario
  "Recebe um salário e calcula o ajuste baseado nas regras do slide 35"
  [salario-antigo]
  (cond
  (<= salario-antigo 280.0)
    (+ salario-antigo (* (/ salario-antigo 100.0) 20))
  (and (> salario-antigo 280.0) (<= salario-antigo 700.0))
      (+ salario-antigo (* (/ salario-antigo 100.0) 15))
  (and (> salario-antigo 700.0) (<= salario-antigo 1500.0))
        (+ salario-antigo (* (/ salario-antigo 100.0) 10))
  (and (> salario-antigo 1500.0) (<= salario-antigo 3000.0))
          (+ salario-antigo (* (/ salario-antigo 100.0) 5))
  (> salario-antigo 3000.0)
          (+ salario-antigo 0)))

(defn calcula-media
  [n1 n2 n3]
  (/ (+ n1 n2 n3 0.0) 3))

;;; Funções Recursivas
;;; São aquelas que, dentro do seu corpo, realizam uma chamada a si próprias.

(defn fatorial
  "Calcula o fatorial de n"
  [n]
  (if (<= n 1)
  1
  (* n (fatorial (dec n)))))

(defn fatorial-tco
  "Calcula o fatorial de n com tail call"
  [n acc]
  (if (<= n 1)
  acc
  (recur (dec n) (* acc n))))



(defn fib [n]
  (if (<= n 2)
    1
    (+ (fib (- n 1)) (fib (- n 2)))))



(defn fib-tco
 ([n] (fib-tco n 0 1 ))
 ([n a b]
  (if (= n 0)
    a
    (if (= n 1)
      b
      (recur (dec n) b (+ a b))))))


(defn pow
  [x n]
  (cond 
  ( = n 1)
    (* 1 x)
  (= n 0)
    (* 1 1)
  (> n 1)
    (* x (pow x (dec n)))))

(defn pow-tco
  [x n acc]
  (cond 
  (= n 1)
    (*  x acc)
  (= n 0)
    (* 1 1)
  (> n 1)
    (recur x (dec n) (* acc x))))


(defn le-do-teclado
  [inicio
   fim]
  (do
    (prn "Digite um número entre" inicio "e" fim)
    (read-line)))




;;; Como gerenciar o estado de um jogo ?
;;; O jogo de adivinhação é definido da seguinte forma:
;;; O computador gera um número aleatório entre 1 e 100
;;; o jogador tem N tentativas para acertar
;;; A cada rodada o jogo diminui o intervalo baseado no chute do jogador
(defn adivinhe-o-numero
  [inicio fim segredo vidas]
  (if  (= vidas 0) 
    "Suas vidas esgotaram, voce perdeu"
    (do
    (def teclado (Integer/parseInt (le-do-teclado inicio fim)))
    (cond
      (or (<= teclado inicio) (>= teclado fim))
          (do
            (prn "entradas invalidas")
            (recur inicio fim segredo vidas))
      (> teclado segredo)
            (recur inicio teclado segredo (dec vidas))
      (< teclado segredo)
            (recur teclado fim segredo (dec vidas))
      (= teclado segredo)
            (str "Voce acertou!! O segredo e " (str segredo))))))



(defn inicia-jogo
  []
  (let [inicio 0
        fim 100
        segredo (inc (rand-int 100))
        vidas 10]
    (adivinhe-o-numero inicio fim segredo vidas)))




(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
