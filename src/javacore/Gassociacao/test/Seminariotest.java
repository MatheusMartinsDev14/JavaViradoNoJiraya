package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class Seminariotest {
    public static void main(String[] args) {

        Local local1 = new Local("Usiminas");
        Local local2 = new Local("Unileste");

        Aluno aluno1 = new Aluno("Matheus", 20);
        Aluno aluno2 = new Aluno("Igor", 20);
        Aluno aluno3 = new Aluno("Pedro", 19);
        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Aluno[] alunos2 = {aluno1, aluno3};

        Professor professor1 = new Professor("Victor Tangoda" , "Direito");
        Professor professor2 = new Professor("Fernando Tangoda", "TI");
        Professor[] professores = {professor1, professor2};

        Seminario seminario1 = new Seminario("Logica de progração");
        Seminario seminario2 = new Seminario("Recursos Humanos");
        Seminario seminario3 = new Seminario("Pessoas e Maquinas");


        seminario1.setLocal(local1);
        seminario1.setAluno(alunos);
        seminario1.setProfessor(professor1);

        seminario2.setLocal(local2);
        seminario2.setProfessor(professor2);

        seminario3.setLocal(local1);
        seminario3.setAluno(alunos2);
        seminario3.setProfessor(professor2);

        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();

    }
}
