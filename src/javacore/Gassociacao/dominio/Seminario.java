package javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Local local;
    private Professor professor;


    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Especialidade: " + professor.getEspecialidade());
        if (aluno != null) {
            System.out.println("Alunos inscritos: ");
            for (Aluno aluno : aluno) {
                System.out.println(aluno.getNome());
            }
        }
        else{
            System.out.println("Esse seminario não possui alunos inscritos");
        }

    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
