package maratonajava.Exercicios.test;

import maratonajava.Exercicios.domain.Vetor;

public class VetorTest {
//    Criar uma calculadora qe recebe uma lista/array e retorne a lista com seus valores multiplicados por 2;
//    Ex: Se a entrada for [1,2,3], o retorno deve ser [2,4,6];
    public static void main(String[] args) {
        int[] numeros = {1,2,3,5,10};
        Vetor vetor = new Vetor();

        vetor.duplicarVetor(numeros);
    }
}
