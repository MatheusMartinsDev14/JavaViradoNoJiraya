package Desafios.Atividade4.Service; // Importa a classe de utilidade para entrada de dados

import Desafios.Atividade4.Model.Funcionario;
import Desafios.Atividade4.Model.Gerente;
import Desafios.Atividade4.Model.Vendedor;
import Desafios.Atividade4.Util.InputUtil;

public class FuncionarioService {

    // Armazena a única instância do funcionário cadastrado (Polimorfismo: pode ser Gerente ou Vendedor)
    private Funcionario funcionarioCadastrado;

    public FuncionarioService() {
        this.funcionarioCadastrado = null;
    }

    /**
     * Cadastra um novo Gerente, sobrescrevendo o funcionário atual.
     */
    public void cadastrarGerente() {
        System.out.println("\n--- Cadastro de Gerente ---");
        String nome = InputUtil.lerTexto("Nome: ");
        String cpf = InputUtil.lerTexto("CPF: ");
        double salario = InputUtil.lerDouble("Salário: ");
        String senha = InputUtil.lerTexto("Senha: ");

        // Cria a instância de Gerente (Herança)
        this.funcionarioCadastrado = new Gerente(nome, cpf, salario, senha);
        System.out.println("✅ Gerente " + nome + " cadastrado com sucesso!");
    }

    /**
     * Cadastra um novo Vendedor, sobrescrevendo o funcionário atual.
     */
    public void cadastrarVendedor() {
        System.out.println("\n--- Cadastro de Vendedor ---");
        String nome = InputUtil.lerTexto("Nome: ");
        String cpf = InputUtil.lerTexto("CPF: ");
        double salario = InputUtil.lerDouble("Salário Base: ");
        double totalVendas = InputUtil.lerDouble("Total de Vendas no mês: ");

        // Cria a instância de Vendedor (Herança)
        this.funcionarioCadastrado = new Vendedor(nome, cpf, salario, totalVendas);
        System.out.println("✅ Vendedor " + nome + " cadastrado com sucesso!");
    }

    /**
     * Exibe os dados do funcionário cadastrado.
     */
    public void exibirDadosFuncionario() {
        if (funcionarioCadastrado != null) {
            System.out.println("\n--- Dados do Funcionário ---");
            // Polimorfismo em ação: chama o método exibirDados() específico da subclasse
            funcionarioCadastrado.exibirDados();
        } else {
            System.out.println("⚠️ Nenhum funcionário cadastrado ainda.");
        }
    }

    /**
     * Calcula e exibe o bônus do funcionário cadastrado.
     */
    public void calcularEExibirBonus() {
        if (funcionarioCadastrado != null) {
            // Polimorfismo em ação: chama o método calcularBonus() específico da subclasse
            double bonus = funcionarioCadastrado.calcularBonus();
            System.out.println("\n--- Cálculo de Bônus ---");
            System.out.printf("Bônus do funcionário %s: R$ %.2f\n", funcionarioCadastrado.getNome(), bonus);
        } else {
            System.out.println("⚠️ Nenhum funcionário cadastrado para calcular bônus.");
        }
    }
}