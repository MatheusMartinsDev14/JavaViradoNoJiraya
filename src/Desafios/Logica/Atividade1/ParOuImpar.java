package Desafios.Logica.Atividade1;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número Par");
        }else{
            System.out.println("Número Impar");
        }

        input.close();
    }
}