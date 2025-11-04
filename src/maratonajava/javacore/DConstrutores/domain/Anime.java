package maratonajava.javacore.DConstrutores.domain;

public class Anime {
    private String tipo;
    private int qntEpisodios;
    private String nome;
    private String genero;

    // Construtor completo: usado para criar um objeto Anime já com todos os atributos inicializados.
    // Os construtores não possuem tipo de retorno e são executados antes de qualquer outro método.
    public Anime(String nome, String tipo, int qntEpisodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.qntEpisodios = qntEpisodios;
        this.genero = genero;
    }

    // Construtor padrão (sem parâmetros): permite criar o objeto sem inicializar os atributos.
    // Os valores padrão serão null (para Strings) e 0 (para inteiros).
    public Anime() {

    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Episódios: " + qntEpisodios);
        System.out.println("Gênero: " + genero);
        System.out.println("---");
    }

    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public int getQntEpisodios() { return qntEpisodios; }
    public String getGenero() { return genero; }
    public void setNome(String nome) { this.nome = nome; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setQntEpisodios(int qntEpisodios) { this.qntEpisodios = qntEpisodios; }
    public void setGenero(String genero) { this.genero = genero; }
}