package Desafios.Atividade3.test;
import Desafios.Atividade3.dominio.Estante;
import Desafios.Atividade3.dominio.Livro;

public class EstanteTest {
    public static void main(String[] args) {
        Estante estante = new Estante();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        Livro livro3 = new Livro("1984", "George Orwell", 1949);

        estante.adicionarLivro(livro1);
        estante.adicionarLivro(livro2);
        estante.adicionarLivro(livro3);

        estante.listarLivros();

        System.out.println("Buscando livro: \"1984\"");
        Livro encontrado = estante.buscarLivroPorTitulo("1984");
        if (encontrado != null) {
            System.out.println("Livro encontrado:");
            encontrado.exibirInformacoes();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}


