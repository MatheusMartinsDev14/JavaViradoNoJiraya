package Desafios.Logica.Atividade4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TarefaService tarefaService = new TarefaService();
        int opcao;

        do {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Buscar tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite a tarefa que deseja adicionar:");
                    tarefaService.adicionarTarefa(scanner.nextLine());
                    break;
                case 2:
                    tarefaService.listarTarefas();
                    break;
                case 3:
                    System.out.println("Digite a tarefa que deseja remover:");
                    tarefaService.removerTarefa(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Digite uma palavra chave:");
                    tarefaService.buscarTarefa(scanner.nextLine());
                    break;
                case 0:
                    System.out.println("Saindo... Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}