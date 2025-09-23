package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;

import java.sql.SQLOutput;

public class ClienteTest01 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente5 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
    }
}
