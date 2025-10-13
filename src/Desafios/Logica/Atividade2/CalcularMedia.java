package Desafios.Logica.Atividade2;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota do aluno:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        String conceito;
        String situacao;

        if (media < 3) {
            conceito = "E";
            situacao = "Reprovado";
        } else if (media < 5) {
            conceito = "D";
            situacao = "Reprovado";
        } else if (media < 7) {
            conceito = "C";
            situacao = "Aprovado";
        } else if (media < 9) {
            conceito = "B";
            situacao = "Aprovado";
        } else {
            conceito = "A";
            situacao = "Aprovado";
        }

        System.out.println("\n--- Resultado do Aluno ---");
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
