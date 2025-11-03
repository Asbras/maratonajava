package maratonajava.javacore.CSobrecargaMetodos.domain;

/**
 *
 *
 * SOBRECARGA DE MÉTODOS
 * → Vários métodos com o MESMO NOME, mas PARÂMETROS DIFERENTES.
 * Regras para sobrecarga funcionar:
 * 1. Mesmo nome do método
 * 2. Parâmetros diferentes em:
 *    - Quantidade
 *    - Tipo
 *    - Ordem dos tipos
 * 3. Tipo de retorno NÃO importa!
 *
 * Aqui temos DUAS versões do método init():
 *    init(String, String, int)           → 3 parâmetros
 *    init(String, String, int, String)   → 4 parâmetros
 *
 * Isso é SOBRECARGA!
 *
 */
public class Anime {
    private String tipo;
    private int qntEpisodios;
    private String nome;
    private String genero;

    /**
     * init() com 3 parâmetros: nome, tipo e episódios.
     *
     * Exemplo:
     * anime.init("Dragon Ball Z", "TV", 291);
     *
     * → Gênero não é obrigatório aqui.
     */
    public void init(String nome, String tipo, int qntEpisodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.qntEpisodios = qntEpisodios;
        // gênero fica null (padrão)
    }

    /**
     * init() com 4 parâmetros: inclui o gênero.
     *
     * Exemplo:
     * anime.init("One Piece", "TV", 1100, "Ação");
     *
     * → Mesma nomeação, mais flexibilidade!
     * → Java escolhe a versão certa pela QUANTIDADE e TIPO dos argumentos.
     */
    public void init(String nome, String tipo, int qntEpisodios, String genero) {
        this.init(nome, tipo, qntEpisodios);
        this.genero = genero;
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