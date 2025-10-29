package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número: ");
        float num1 = entrada.nextFloat();
        System.out.println("Digite o valor do segundo número: ");
        float num2 = entrada.nextFloat();

        double soma = calc.soma(10, 10);
        double produto = calc.multiplica(20, 2);
        double diferenca = calc.subtrai(20, 10);

        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Multiplicação: %.0f%n", produto);
        System.out.printf("Subtração: %.0f%n", diferenca);
        // garantir que não aconteça nenuma divisão por zero
        try {
            double divisao = calc.divide(num1, num2);
            System.out.printf("Divisão: %.2f%n", divisao);
        } catch (Exception e) {
            System.out.println("Não existe divisão por zero");
        }
    }
}