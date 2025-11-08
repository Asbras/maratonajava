package maratonajava.javacore.EBlocosinicializacao.test;

import maratonajava.javacore.Fmodificadorestatico.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
