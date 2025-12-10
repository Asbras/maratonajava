package maratonajava.Exercicios.Exercicio01.test;

import maratonajava.Exercicios.Exercicio01.domain.Impressora;

public class ImpressoraTest {
    public static void main(String[] args) {
        Impressora pessoa1 = new Impressora("joão", 25, "Eu estou estudando Java");
        pessoa1.imprimirMensagem();
    }
}
