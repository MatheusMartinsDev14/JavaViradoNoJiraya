package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class Seminariotest {
    public static void main(String[] args) {

        Local local = new Local("Usiminas");

        Aluno aluno = new Aluno("Matheus", 20);
        Aluno[] alunos = {aluno};


        Professor professor = new Professor("Victor Tangoda" , "Direito");
        Professor[] professores = {professor};

        Seminario seminario = new Seminario("Logica de progração");
        Seminario[] seminariosDisponiveis = {seminario};

        professor.imprime();

    }
}
