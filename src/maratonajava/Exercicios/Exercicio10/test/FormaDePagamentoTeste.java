package maratonajava.Exercicios.Exercicio10.test;

import maratonajava.Exercicios.Exercicio10.domain.FormaDePagamento;

import java.util.Scanner;

public class FormaDePagamentoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FormaDePagamento teste = new FormaDePagamento();
        int opt;

        do { // Validar a entrada de opção de pagamento
            System.out.println("Digite a forma de pagamento");
            System.out.println("1 - Dinheiro ou PIX");
            System.out.println("2 - Cartão de crédito a vista");
            System.out.println("3 - Cartão de crédito dividido em 2x");
            System.out.println("4 - Cartão de crédito dividido em 3x ou mais vezes");
            opt = entrada.nextInt();
        } while (opt < 1 || opt > 4);

        // Receber o valor do produto
        System.out.println("Digite o valor do produto");
        double valor = entrada.nextDouble();
        teste.setValor(valor);

        // Imprimir o valor total
        System.out.printf("Valor total = %.2f", teste.calcularValor(opt));
    }
}
