package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Naruto Uzimaki");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Matheus");
        funcionario.setSalario(1700);
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);

        funcionario.imprime();

    }
}
