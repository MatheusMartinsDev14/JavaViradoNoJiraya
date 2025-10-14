package Desafios.Atividade4.Util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int lerInt(String mensagem) {
        int numero;
        while (true) {
            try {
                System.out.print(mensagem);
                numero = Integer.parseInt(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    // Lê número decimais (double) com validação
    public static double lerDouble(String mensagem) {
        double numero;
        while (true) {
            try {
                System.out.print(mensagem);
                numero = Double.parseDouble(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número decimal, exemplo: 10.5");
            }
        }
    }

    // Lê uma opção do menu como inteiro
    public static int lerOpcaoMenu(String mensagem) {
        return lerInt(mensagem);
    }
}