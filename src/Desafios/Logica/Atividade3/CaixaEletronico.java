package Desafios.Logica.Atividade3;

import java.util.Scanner;

public class CaixaEletronico {
    Scanner scanner = new Scanner(System.in);
    private double saldo = 1000;
    private double valor;


    public void verSaldo() {
        System.out.println(saldo);
    }

    public double depositar() {
        System.out.println("Insira o valor que você deseja depositar: ");
        valor = scanner.nextInt();
        saldo += valor;
        return saldo;
    }

    public double sacar() {
        System.out.println("Insira o valor que você deseja sacar:");
        valor = scanner.nextInt();
        if (saldo > valor){
            System.out.println("Saque realizado com sucesso!");
            saldo -= valor;
            return saldo;
        }
        System.out.println("Você não tem saldo suficiente para realizar esse saque");
        return saldo;
    }

}