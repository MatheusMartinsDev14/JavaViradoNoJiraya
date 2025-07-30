package javacore.intruducaoclasses.test;

import javacore.intruducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro2.nome = "Mustang";

        carro1.modelo = "Sport";
        carro2.modelo = "GT 500";

        carro1.ano = 1980;
        carro2.ano = 1968;

        System.out.println("Carro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("Carro 2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
