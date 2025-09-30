package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
