package maratonajava.Exercicios.Exercicio08.test;

import maratonajava.Exercicios.Exercicio08.domain.IMC;

import java.util.Scanner;

public class IMCTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        IMC teste = new IMC();

        System.out.println("Digite a sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        teste.setAltura(altura);
        teste.setPeso(peso);
        double imc = teste.calcularIMC();

        System.out.printf("%.2f / %.2f² = %.2f\n", altura, peso, imc);
        teste.categorizarIMC(imc);
    }
}
