package Desafios.Atividade1.test;

import Desafios.Atividade1.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Matheus", 20);
        Pessoa pessoa2 = new Pessoa("Luiza", 18);

        pessoa.fazerAniversario();

        pessoa.exibirDados();
        pessoa2.exibirDados();
    }
}
