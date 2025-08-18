package javacore.Bintoducaometodos.test;

import javacore.Bintoducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Matheus");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimir(funcionario);
        funcionario.mediaSalario(funcionario);

    }

}
