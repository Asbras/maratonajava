package maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
     * ORDEM DE INICIALIZAÇÃO (JVM):
     * 1. Blocos static {} → executados UMA VEZ (na carga da classe)
     * 2. Alocação de memória do objeto
     * 3. Atributos de instância recebem valor default
     * 4. Blocos de instância {} → executados por objeto
     * 5. Construtor é executado
     */
    static {
        // Bloco de inicialização estático é executado apenas uma vez e se houver mais de um método estático, eles são
        // executadas na ordem em que aparecem na classe
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    { // Bloco de inicialização não estático é executado toda vez que um objeto for instanciado
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
