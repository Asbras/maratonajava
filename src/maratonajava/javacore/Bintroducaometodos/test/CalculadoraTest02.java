package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        // usando o array
        calculadora.somaArray(numeros);
        // usando varargs
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);
    }
}