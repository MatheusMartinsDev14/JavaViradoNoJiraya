package Desafios.Atividade3.dominio;

public class Estante {
    private Livro[] livros = new Livro[5];
    private int quantidadeLivros = 0;

    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < livros.length) {
            livros[quantidadeLivros] = livro;
            quantidadeLivros++;
            System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado com sucesso!");
        } else {
            System.out.println("Estante cheia! Não é possível adicionar mais livros.");
        }
    }

    public void listarLivros() {
        if (quantidadeLivros == 0) {
            System.out.println("Nenhum livro na estante.");
        } else {
            System.out.println("\n--- Lista de Livros na Estante ---");
            for (int i = 0; i < quantidadeLivros; i++) {
                livros[i].exibirInformacoes();
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (int i = 0; i < quantidadeLivros; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }
        return null;
    }
}