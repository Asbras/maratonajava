package maratonajava.javacore.GAssociacao.test;

import maratonajava.javacore.GAssociacao.domain.Jogador;
import maratonajava.javacore.GAssociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
