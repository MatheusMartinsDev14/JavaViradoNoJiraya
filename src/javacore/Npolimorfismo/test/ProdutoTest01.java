package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate padrão", 10);

        CalculadoraImposto.caluclarImpostoComputador(computador);
        System.out.println("---------------");
        CalculadoraImposto.caluclarImpostoTomate(tomate);


    }
}
