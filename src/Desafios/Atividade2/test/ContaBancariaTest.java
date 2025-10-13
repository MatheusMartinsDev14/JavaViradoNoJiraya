package Desafios.Atividade2.test;

import Desafios.Atividade2.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Matheus", 1, 10000);
        ContaBancaria conta2 = new ContaBancaria("Luiza", 2, 5000);

        conta1.depositar(5000);
        conta1.depositar(-112);
        conta2.sacar(2500);
        conta2.sacar(5000);

        conta1.exibirDados();
        conta2.exibirDados();
    }
}
