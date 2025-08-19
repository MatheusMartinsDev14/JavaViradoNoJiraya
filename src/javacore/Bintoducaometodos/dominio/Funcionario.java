package javacore.Bintoducaometodos.dominio;

public class Funcionario {
    private String nome = "Matheus";
    private int idade = 20;
    private double media;
    private double [] salarios;

    public void imprimir(Funcionario funcionario){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < 3; i++) {
            System.out.println(this.salarios[i]);
        }
    }

    public void mediaSalario(Funcionario funcionario){
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println(media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salario) {
        this.salarios = salario;
    }
}
