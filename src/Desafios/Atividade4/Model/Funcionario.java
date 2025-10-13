package Desafios.Atividade4.Model;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double calcularBonus(){
        return 0;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Salário: " + salario + " | Cargo: Funcionario Base");
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

}
