package javacore.intoducaometodos.test;

import javacore.intoducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(5, 2);
        System.out.println("Multiplicação Realizada");
    }
}
