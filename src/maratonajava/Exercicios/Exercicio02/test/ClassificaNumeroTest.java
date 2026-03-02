package maratonajava.Exercicios.Exercicio02.test;

import maratonajava.Exercicios.Exercicio02.domain.ClassificaNumero;

import java.util.Scanner;

public class ClassificaNumeroTest {
    public static void main(String[] args) {
        ClassificaNumero teste = new ClassificaNumero();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro qualquer:");
        int num = entrada.nextInt();
        teste.setNum(num);

        if (teste.isPar()) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        if(teste.isPositivo()) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        entrada.close();
    }
}
