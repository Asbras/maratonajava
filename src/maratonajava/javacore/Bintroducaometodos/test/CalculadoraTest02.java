package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        // Quando você passa a e b, os valores não são passados por referência.
        // Os valores de a e b são copiados, por isso não há alteração nos valores de a e b no main.
        calculadora.alteraDoisNumeros(a,b);

        // Mostrar que o valor dos objetos não foi alterado pelo método alteraDoisNumeros.
        System.out.println("Dento CalculadoraTest02: ");
        System.out.println("A = " + a + "\nB = " + b);

    }
}
