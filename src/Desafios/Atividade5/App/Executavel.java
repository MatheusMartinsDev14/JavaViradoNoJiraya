package Desafios.Atividade5.App;

import Desafios.Atividade5.Model.Caminhao;
import Desafios.Atividade5.Model.Carro;
import Desafios.Atividade5.Model.Moto;
import Desafios.Atividade5.Model.TipoCombustivel;

public class Executavel {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", "Modelo carro" ,2020, TipoCombustivel.GASOLINA, 7, 50);
        Caminhao caminhao1 = new Caminhao("Mercedes", "Modelo caminhão", 2021, TipoCombustivel.DIESEL, 5, 100);
        Moto moto1 = new Moto("Yamaha", "Lander 250", 2025, TipoCombustivel.GASOLINA, 15, 15);


        carro1.toString();
        caminhao1.toString();
        moto1.toString();
    }
}
