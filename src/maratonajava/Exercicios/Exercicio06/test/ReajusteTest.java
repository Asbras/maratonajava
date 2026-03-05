package maratonajava.Exercicios.Exercicio06.test;

import maratonajava.Exercicios.Exercicio06.domain.Reajuste;

import java.util.Scanner;

public class ReajusteTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Reajuste teste = new Reajuste();

        System.out.println("Digite um valor qualquer");
        double valor = entrada.nextDouble();

        teste.setValor(valor);
        System.out.println("Valor reajustado: " + teste.reajuste());
    }
}
