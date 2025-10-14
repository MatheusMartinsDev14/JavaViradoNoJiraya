package Desafios.Atividade5.App;

import Desafios.Atividade5.Interfaces.Calculavel;
import Desafios.Atividade5.Model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executavel{

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n==== MENU VEÍCULOS ====");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Calcular autonomias");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cadastrarVeiculo();
                case 2 -> listarVeiculos();
                case 3 -> calcularAutonomias();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarVeiculo() {
        System.out.println("\n1. Carro  2. Moto  3. Caminhão");
        System.out.print("Tipo de veículo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Consumo médio (km/l): ");
        double consumo = scanner.nextDouble();
        System.out.print("Capacidade do tanque (l): ");
        double tanque = scanner.nextDouble();

        TipoCombustivel combustivel = TipoCombustivel.GASOLINA; // default
        Veiculo v = null;

        switch (tipo) {
            case 1 -> v = new Carro(marca, modelo, ano, combustivel, consumo, tanque);
            case 2 -> v = new Moto(marca, modelo, ano, combustivel, consumo, tanque);
            case 3 -> v = new Caminhao(marca, modelo, ano, combustivel, consumo, tanque);
            default -> System.out.println("Tipo inválido.");
        }
        if (v != null) {
            veiculos.add(v);
            System.out.println("Veículo cadastrado com sucesso!");
        }
    }

    private static void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("\nLista de veículos:");
            for (Veiculo v : veiculos) {
                System.out.println("- " + v);
            }
        }
    }

    private static void calcularAutonomias() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("\nAutonomias:");
            for (Veiculo v : veiculos) {
                if (v instanceof Calculavel c) {
                    System.out.printf("%s -> %.2f km%n", v, c.calcularAutonomia());
                }
            }
        }
    }
}