package maratonajava.Exercicios.Exercicio07.test;

import maratonajava.Exercicios.Exercicio07.domain.VerificaBooleanos;

import java.util.Scanner;

public class VerificaBooleanosTest {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        VerificaBooleanos teste = new VerificaBooleanos();

        // Validar entrada do primeiro número
        int num1;
        do {
            System.out.println("Digite 1 para verdadeiro ou 0 para falso");
            System.out.println("Primeiro número: ");
            num1 = entrada.nextInt();
            if (num1 != 1 && num1 != 0) {
                System.out.println("Valor digitado inválido.");
            }
        } while (num1 != 1 && num1 != 0);

        // setar o valor do primeiro booleano
        boolean bol1;
        if (num1 == 1) {
            bol1 = true;
        } else {
            bol1 = false;
        }
        teste.setBol1(bol1);

        // Validar entrada do segundo número
        int num2;
        do {
            System.out.println("Digite 1 para verdadeiro ou 0 para falso");
            System.out.println("Segundo número: ");
            num2= entrada.nextInt();
            if (num2 != 1 && num2 != 0) {
                System.out.println("Valor digitado inválido.");
            }
        } while (num2 != 1 && num2 != 0);

        // setar o valor do segundo booleano
        boolean bol2;
        if (num2 == 1) {
            bol2 = true;
        } else {
            bol2 = false;
        }
        teste.setBol2(bol2);

        teste.checarBoleanos();
    }
}
