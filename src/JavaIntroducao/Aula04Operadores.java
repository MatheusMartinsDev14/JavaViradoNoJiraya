package JavaIntroducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int number01 = 10;
        int number02 = 20;
        double resultado = number01 / (double)number02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > >= <= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIguaDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezDiferenteVinte = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIguaDez);
        System.out.println(isDezDiferenteDez);
        System.out.println(isDezDiferenteVinte);

    }
}
