package maratonajava.Exercicios.Exercicio05.test;

import maratonajava.Exercicios.Exercicio05.domain.SalarioMinimo;

import java.util.Scanner;

public class SalarioMinimoTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SalarioMinimo teste = new SalarioMinimo();

        System.out.println("Digite o seu salario atual");
        double salario = entrada.nextDouble();
        if (salario >= 0) {
            teste.setSalario(salario);
            System.out.printf("Voce recebe %.2f salario(s) minimo(s)");
        }
    }
}
