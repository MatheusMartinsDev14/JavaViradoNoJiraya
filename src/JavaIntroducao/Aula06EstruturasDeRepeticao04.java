package JavaIntroducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000

        double valorCarro = 30000;
        for (int i = 1; i <= valorCarro ; i++) {
            double valoParcela = valorCarro / i;
            System.out.println("Parcela: " + valoParcela);
            if (valoParcela <= 1000){
                System.out.println("Valor maximo de parcelas: " + i);
                break;
            }
        }
    }
}
