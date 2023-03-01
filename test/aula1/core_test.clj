(ns aula1.core-test
  (:require [clojure.test :refer :all]
            [aula1.core :refer :all]))



(deftest testa-sucessor-antecessor
  (testing "Testa a função sucessor"
    (is (= (sucessor 0) 1))
    (is (= (sucessor 1) 2))
    (is (= (sucessor 999) 1000))
    (is (= (antecessor 1) 0))
    (is (= (antecessor 1000) 999))
    (is (= (antecessor 0) -1))))



(deftest testa-soma
  (testing "Testa a função soma"
    (is (= (soma 1 2) 3))
    (is (= (soma 1 0) 1))
    (is (= (soma 999 1) 1000))
    (is (= (soma 1. 1.) 2.0))))

(deftest testa-sub
  (testing "Testa a função subtração"
    (is (= (sub 2 1) 1))
    (is (= (sub 0 1) -1))
    (is (= (sub 1 1) 0))))

(deftest testa-mult
  (testing "Testa a função multiplicação"
    (is (= (mult 1 0) 0))
    (is (= (mult 2 2) 4))
    (is (= (mult 1000 1) 1000))))

(deftest testa-div
  (testing "Testa a função divisão"
    (is (= (div 20 10) 2))
    (is (= (div 5 2) 5/2))
    (is (thrown? java.lang.ArithmeticException (div 1 0)))))


(deftest testa-maior-menor
  (testing "Testa as funções maior? e menor?"
    (is (= (maior? 0) false))
    (is (= (maior? 18) true))
    (is (= (menor? 18) false))
    (is (= (menor? 35) false))
    (is (= (menor? 17) true))))

(deftest testa-baixo-alto
  (testing "Testa as funções baixo? e alto?"
    (is (= (baixo? 1.5) true))
    (is (= (baixo? 1.6) false))
    (is (= (alto? 1.3) false))
    (is (= (alto? 1.8) true))))

(deftest testa-medio
  (testing "Testa a função medio?"
    (is (= (medio? 1.75) true))
    (is (= (medio? 1.6) true))
    (is (= (medio? 1.8) true))
    (is (= (medio? 1.59) false))
    (is (= (medio? 1.81) false))))


(deftest testa-par-impar
  (testing "Testa as funções par? e impar?"
    (is (= (par? 2) true))
    (is (= (par? 999) false))
    (is (= (impar? 3) true))
    (is (= (impar? 1000) false))))


(deftest testa-area-circ
  (testing "Testa a função area-circ"
    (is (= (area-circ 10) 314.15))
    (is (= (area-circ 5.3) 88.24))))

(deftest testa-triangulo
  (testing "Testa a função eh-triangulo?"
    (is (= (eh-triangulo? 10 14 8) true))
    (is (= (eh-triangulo? 2 10 14) false))))


(deftest testa-novo-salario
  (testing "Testa a função novo-salario"
    (is (= (novo-salario 150) 180.0))
    (is (= (novo-salario 280) 336.0))
    (is (= (novo-salario 281) 323.15))
    (is (= (novo-salario 700) 805.0))
    (is (= (novo-salario 701) 771.1))
    (is (= (novo-salario 1500) 1650.0))
    (is (= (novo-salario 1501) 1576.05))
    (is (= (novo-salario 3000) 3150.0))
    (is (= (novo-salario 3001) 3001))))


(deftest testa-calcula-media
  (testing "Testa a função que calcula a média de um aluno."
    (is (= (calcula-media 7 7 7) 7.0))))


(deftest testa-fibonacci
  (testing "Testa as funções fibonacci"
    (is (= (fib 5) 5))
    (is (= (fib 6) 8))
    (is (= (fib 1) 1))
    (is (= (fib-tco 10) 55))
    (is (= (fib-tco 34) 5702887))))


(deftest testa-fatorial
  (testing "Testa as funções que calculam fatorial"
    (is (= (fatorial 5) 120))
    (is (= (fatorial-tco 5 1) 120))
    (is (= (fatorial 0) 1))
    (is (= (fatorial-tco 0 1) 1))))

(deftest testa-pow
  (testing "Testa a função de potenciação"
    (is (= (pow 2 3) 8))
    (is (= (pow 10 2) 100))
    (is (= (pow 1 0) 1))
    (is (= (pow-tco 2 3 1) 8))
    (is (= (pow-tco 10 3 1) 1000))
    (is (= (pow 10 0) 1))))
