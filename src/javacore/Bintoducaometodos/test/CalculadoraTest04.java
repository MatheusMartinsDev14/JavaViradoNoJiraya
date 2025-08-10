package javacore.Bintoducaometodos.test;

import javacore.Bintoducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(a, b);
        System.out.println(a);
        System.out.println(b);

    }
}
