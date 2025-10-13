package Desafios.Atividade4;

import Desafios.Atividade4.Service.FuncionarioService;
import Desafios.Atividade4.Util.InputUtil;

public class Test {

    public static void main(String[] args) {
        FuncionarioService service = new FuncionarioService();
        boolean rodando = true;

        while (rodando) {
            exibirMenu();
            int opcao = InputUtil.lerOpcaoMenu("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    service.cadastrarGerente();
                    break;
                case 2:
                    service.cadastrarVendedor();
                    break;
                case 3:
                    service.exibirDadosFuncionario();
                    break;
                case 4:
                    service.calcularEExibirBonus();
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Saindo do Sistema. Obrigado!");
                    break;
                default:
                    System.out.println("🚫 Opção inválida. Tente novamente.");
            }
            // Separação visual para próxima interação
            System.out.println("\n----------------------------------------------------\n");
        }
    }

    private static void exibirMenu() {
        System.out.println("===== Sistema de Gerenciamento de Funcionários =====");
        System.out.println("1 - Cadastrar Gerente");
        System.out.println("2 - Cadastrar Vendedor");
        System.out.println("3 - Exibir dados do funcionário");
        System.out.println("4 - Calcular bônus");
        System.out.println("5 - Sair");
        System.out.println("====================================================");
    }
}