package JavaIntroducao;

public class Aula5OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Não vou doar nenhum valor";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
