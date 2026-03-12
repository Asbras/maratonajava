package maratonajava.Exercicios.Exercicio12.teste;

import maratonajava.Exercicios.Exercicio12.domain.TrocarNumeros;

import java.util.Scanner;

public class TrocarNumerosTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TrocarNumeros teste = new TrocarNumeros();

        System.out.println("Digite o valor de A");
        double a = entrada.nextDouble();
        System.out.println("Digite o valor de B");
        double b = entrada.nextDouble();

        teste.setA(a);
        teste.setB(b);

        System.out.printf("A = %.2f\nB = %.2f\n", teste.getA(), teste.getB());
        teste.trocarNumeros();
        System.out.printf("A = %.2f\nB = %.2f", teste.getA(), teste.getB());
    }
}
