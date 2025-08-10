package javacore.Bintoducaometodos.test;

import javacore.Bintoducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Matheus";
        funcionario.idade = 20;
        funcionario.salario[0] = 1700;
        funcionario.salario[1] = 5000;
        funcionario.salario[2] = 7500;

        funcionario.imprimir(funcionario);
        funcionario.mediaSalario(funcionario);

    }

}
