package JavaIntroducao;

public class Aula5EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean maiorIdade = idade >= 18;

        if (maiorIdade) {
            System.out.println("Possui Maior Idade");
        }
        else {
            System.out.println("Não possui Maior Idade");
        }

        
        String categoria;
        if (idade < 15) {
           categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18) {
            categoria = ("Categoria Juvenil");
        } else {
            categoria = ("Categoria Adulto");
        }
        System.out.println(categoria);
    }
}
