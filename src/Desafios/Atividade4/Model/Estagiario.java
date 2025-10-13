package Desafios.Atividade4.Model;

public class Estagiario extends Funcionario{
    public static final double BONUS_ESTAGIARIO = 150;
    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario + BONUS_ESTAGIARIO;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
