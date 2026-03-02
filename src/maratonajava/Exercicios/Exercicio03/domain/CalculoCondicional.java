package maratonajava.Exercicios.Exercicio03.domain;

// Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar
// os dois valores caso contrário devera multiplicar A e B. Ao final de qualquer um dos cálculos deve-se atribuir
// o resultado a uma variável C e imprimir o seu valor na tela.
public class CalculoCondicional {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isIgual() {
        return a == b;
    }

    public int calculo() {
        if (isIgual()) {
            return a + b;
        } else {
            return a * b;
        }
    }
}
