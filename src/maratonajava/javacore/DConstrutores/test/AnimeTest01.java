package maratonajava.javacore.DConstrutores.test;

import maratonajava.javacore.DConstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "TV", 291, "Ação");
        Anime anime2 = new Anime();
        anime.imprimir();
    }
}
