package maratonajava.javacore.CSobrecargaMetodos.test;

import maratonajava.javacore.CSobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball Z", "TV", 291);
        anime.imprimir();
    }
}
