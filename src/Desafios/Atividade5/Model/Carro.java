package Desafios.Atividade5.Model;

import Desafios.Atividade5.Interfaces.Calculavel;

public class Carro extends Veiculo implements Calculavel {

    public Carro(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel, double consumoMedio, double capacidadeTanque) {
        super(marca, modelo, ano, tipoCombustivel, consumoMedio, capacidadeTanque);
    }

    @Override
    public double calcularAutonomia() {
        return getConsumoMedio() * getCapacidadeTanque();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", tipoCombustivel=" + tipoCombustivel +
                ", consumoMedio=" + consumoMedio +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }
}
