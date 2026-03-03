package maratonajava.Exercicios.Exercicio04.test;

import maratonajava.Exercicios.Exercicio04.domain.SucessorAntecessor;

import java.util.Scanner;

public class SucessorAntecessorTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SucessorAntecessor teste = new SucessorAntecessor();

        System.out.println("Escreva um número qualquer");
        int x = entrada.nextInt();

        teste.setNumero(x);
        System.out.println("Sucessor = " + teste.imprimirSucessor());
        System.out.println("Antecessor = " + teste.imprimirAntecessor());
    }
}
