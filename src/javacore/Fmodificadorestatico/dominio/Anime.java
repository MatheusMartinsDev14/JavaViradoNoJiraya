package javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0- Bloco de inicialização é executado quando a JVM carregar classe
    // 1- Alocado espaço em memória po objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
        System.out.println("Dentro do bloco de inicialização estatico");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estatico");
    }
    public Anime(String nome){
        this.nome = nome;

    }

    public Anime(){
        System.out.println(episodios);
        for (int episodio: Anime.episodios) {
            System.out.println(episodio + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
