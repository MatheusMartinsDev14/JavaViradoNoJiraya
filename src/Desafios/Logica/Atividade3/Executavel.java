package Desafios.Logica.Atividade3;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico();

        do {
            System.out.println("===== BANCO JAVA =====\n" +
                    "1 - Ver saldo\n" +
                    "2 - Depositar\n" +
                    "3 - Sacar\n" +
                    "0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    caixa.verSaldo();
                    break;
                case 2:
                    caixa.depositar();
                    break;
                case 3:
                    caixa.sacar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção incorreta");
            }

        } while (opcao != 0);
        scanner.close();
    }
}
