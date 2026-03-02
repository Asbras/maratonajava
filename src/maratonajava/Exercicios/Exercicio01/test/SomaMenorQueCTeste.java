package maratonajava.Exercicios.Exercicio01.test;

import maratonajava.Exercicios.Exercicio01.dominio.SomaMenorQueC;

import java.util.Scanner;

public class SomaMenorQueCTeste {
    public static void main(String[] args) {
        SomaMenorQueC teste = new SomaMenorQueC();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        double a = entrada.nextDouble();
        System.out.println("Digite o valor de B");
        double b = entrada.nextDouble();
        System.out.println("Digite o valor de C");
        double c = entrada.nextDouble();

        teste.setA(a);
        teste.setB(b);
        teste.setC(c);
        teste.soma();
        teste.imprimeSoma();
        teste.verificaSeSomaMenorQueC();
        entrada.close();
    }
}
