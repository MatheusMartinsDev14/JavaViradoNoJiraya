package Desafios.Atividade5.Model;

import Desafios.Atividade5.Interfaces.Calculavel;

public class Caminhao extends Veiculo implements Calculavel {

    public Caminhao(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel, double consumoMedio, double capacidadeTanque) {
        super(marca, modelo, ano, tipoCombustivel, consumoMedio, capacidadeTanque);
    }

    @Override
    public double calcularAutonomia() {
        return getConsumoMedio() * getCapacidadeTanque() * 0.85;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", tipoCombustivel=" + tipoCombustivel +
                ", consumoMedio=" + consumoMedio +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }
}
