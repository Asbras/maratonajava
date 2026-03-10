package maratonajava.Exercicios.Exercicio09.test;

import maratonajava.Exercicios.Exercicio09.domain.MediaNotas;

import java.util.Scanner;

public class MediaNotasTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[3];

        for (int i=0; i< notas.length; i++) {
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = entrada.nextDouble();
        }
        MediaNotas teste = new MediaNotas(notas);
        double media = teste.calcularMedia();

        System.out.printf("A sua média é: %.2f\n", media);
    }
}
