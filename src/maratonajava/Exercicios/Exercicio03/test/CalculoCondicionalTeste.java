package maratonajava.Exercicios.Exercicio03.test;

import maratonajava.Exercicios.Exercicio03.domain.CalculoCondicional;

import java.util.Scanner;

public class CalculoCondicionalTeste {
    public static void main(String[] args) {
        CalculoCondicional teste = new CalculoCondicional();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = entrada.nextInt();

        teste.setA(a);
        teste.setB(b);
        if (teste.isIgual()) {
            System.out.println("A é igual a B. Somando A e B");
            int c = teste.calculo();
            System.out.println("A + B = " + c);
        } else {
            System.out.println("A é diferente a B. Multiplicando A e B");
            int c = teste.calculo();
            System.out.println("A x B = " + c);
        }
    }
}
