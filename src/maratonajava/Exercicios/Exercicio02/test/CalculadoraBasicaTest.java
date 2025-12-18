package maratonajava.Exercicios.Exercicio02.test;

import maratonajava.Exercicios.Exercicio02.domain.CalculadoraBasica;

public class CalculadoraBasicaTest {
    public static void main(String[] args) {
        CalculadoraBasica calculadora = new CalculadoraBasica();

        System.out.println("2 + 5 = " + calculadora.somar(2,5));
        System.out.println("2 - 5 = " + calculadora.subtrair(2,5));
        System.out.println("2 * 5 = " + calculadora.multiplicar(2,5));
        System.out.println("2 / 5 = " + calculadora.dividir(2,5));
    }
}
