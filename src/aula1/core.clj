(ns aula1.core
  (:gen-class))

;;; colar aqui as funções
(defn sucessor
  "Retorna o sucessor de um número"
  [n]
  'implementar)

(defn antecessor
  "Retorna o antecessor de um número"
  [n]
  'implementar)

(defn soma
  "Soma dois números"
  [a
   b]
  'implementar)

(defn sub
  "Subtrai dois números"
  [a
   b]
  'implementar)

(defn mult
  "Multiplica dois números"
  [a b]
  'implementar)

(defn div
  "Divide dois números"
  [a
   b]
  (/ a b))

(defn maior?
  "Retorna true se for maior de idade, false caso contrário"
  [idade]
  'implementar)

(defn menor?
  "Retorna true se for menor de idade, false caso contrário"
  [idade]
  'implementar)

(defn baixo?
  "Retorna true se a altura for menor que 1.6 metros, false caso contrário"
  [altura]
  'implementar)

(defn alto?
  "Retorna true se a altura for maior que 1.8 metros, false caso contrário"
  [altura]
  'implementar)

(defn medio?
  "Retorna true se a idade estiver entre 1.6 e 1.8 metros, false caso contrário"
  [altura]
  'implementar)

(defn par?
  "Retorna true se o número for par, false caso contrário."
  [n]
  'implementar)

(defn impar?
  "Retorna true se o número for ímpar, true caso contrário."
  [n]
  'implementar)


;;; Definindo uma variável
;;; Em clojure, variável tem o mesmo significado da matemática

(def PI 3.1415)



(defn area-circ
  "Recebe um raio e calcula a área da circunferência."
  [raio]
  'implementar)

(defn eh-triangulo?
  "Recebe 3 lados e verifica se formam um triângulo de acordo com as regras do slide 34."
  [a b c]
  'implementar)

(defn novo-salario
  "Recebe um salário e calcula o ajuste baseado nas regras do slide 35"
  [salario-antigo]
  'implementar)

(defn calcula-media
  [n1 n2 n3]
  'implementar)

;;; Funções Recursivas
;;; São aquelas que, dentro do seu corpo, realizam uma chamada a si próprias.

(defn fatorial
  "Calcula o fatorial de n"
  [n]
  'implementar)

(defn fatorial-tco
  "Calcula o fatorial de n com tail call"
  [n]
  'implementar)



(defn fib [n]
  (if (<= n 2)
    1
    (+ (fib (- n 1)) (fib (- n 2)))))



(defn fib-tco [n]
  'implementar)


(defn pow
  [x n]
  'implementar)

(defn pow-tco
  [x n]
  'implementar)


(defn le-do-teclado!
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
  [inicio
   fim
   segredo
   vidas]
  'implementar)

(defn inicia-jogo
  []
  (let [inicio 1
        fim 100
        segredo (inc (rand-int 100))
        vidas 5]
    (adivinhe-o-numero inicio fim segredo vidas)))




(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
