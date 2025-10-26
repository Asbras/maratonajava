package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros(10, 10);
        calculadora.dividirDoisNumeros(10,2.5F);
        calculadora.multiplicarDoisNumeros(20,2);
        calculadora.subtrairDoisNumeros(20,10);
    }
}