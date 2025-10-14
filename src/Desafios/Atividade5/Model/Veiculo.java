package Desafios.Atividade5.Model;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private TipoCombustivel tipoCombustivel;
    private double consumoMedio;
    private double capacidadeTanque;

    public Veiculo(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel, double consumoMedio, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.consumoMedio = consumoMedio;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", tipoCombustivel=" + tipoCombustivel +
                ", consumoMedio=" + consumoMedio +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }
}
