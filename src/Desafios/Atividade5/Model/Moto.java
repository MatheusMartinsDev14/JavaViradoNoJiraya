package Desafios.Atividade5.Model;

import Desafios.Atividade5.Interfaces.Calculavel;

public class Moto extends Veiculo implements Calculavel{

    public Moto(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel, double consumoMedio, double capacidadeTanque) {
        super(marca, modelo, ano, tipoCombustivel, consumoMedio, capacidadeTanque);
    }

    @Override
    public double calcularAutonomia() {
        return getConsumoMedio() * getCapacidadeTanque() * 1.1;
    }

}
