package javacore.Bintoducaometodos.dominio;

public class Funcionario {
    public String nome = "Matheus";
    public int idade = 20;
    public double [] salario = new double[3];

    public void imprimir(Funcionario funcionario){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < 3; i++) {
            System.out.println(this.salario[i]);
        }
    }

    public void mediaSalario(Funcionario funcionario){

        double media =0;
        for (double salario: salario){
            media += salario;
        }
        media /= salario.length;
        System.out.println(media);
    }
}
