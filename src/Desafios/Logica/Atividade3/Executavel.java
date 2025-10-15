package Desafios.Logica.Atividade3;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico();

        int opcao;

        do {
            System.out.println("\n===== BANCO JAVA =====");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver Extrato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: R$" + caixa.getSaldo());
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    if (caixa.depositar(valorDeposito)) {
                        System.out.println("✅ Depósito realizado com sucesso!");
                    } else {
                        System.out.println("❌ Valor de depósito inválido!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    if (caixa.sacar(valorSaque)) {
                        System.out.println("✅ Saque realizado com sucesso!");
                    } else {
                        System.out.println("❌ Saldo insuficiente ou valor inválido!");
                    }
                    break;

                case 4:
                    System.out.println("===== EXTRATO =====");
                    if (caixa.verExtrato().isEmpty()) {
                        System.out.println("Nenhuma operação realizada ainda.");
                    } else {
                        for (String item : caixa.verExtrato()) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando... Obrigado por usar o Banco Java!");
                    break;

                default:
                    System.out.println("❌ Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
