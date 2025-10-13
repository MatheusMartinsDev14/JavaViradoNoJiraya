package Desafios.Atividade4.Model;

public class Vendedor extends Funcionario{
    private double totalVendas;
    public static final double BONUS_POR_VENDA = 0.10;

    public Vendedor(String nome, String cpf, double salario, double totalVendas) {
        super(nome, cpf, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * BONUS_POR_VENDA;
    }
}
