package Desafios.Atividade4.Model;

public class Gerente extends Funcionario {
    private String senha;
    public static final double BONUS_POR_CENTO = 0.20;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autenticar(String senha){
        if (senha.equals(this.senha)){
            return true;
        }
            return false;
    }

    @Override
    public double calcularBonus() {
        return this.salario * BONUS_POR_CENTO;
    }
}
