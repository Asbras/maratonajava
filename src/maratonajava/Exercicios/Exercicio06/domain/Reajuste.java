package maratonajava.Exercicios.Exercicio06.domain;

public class Reajuste {
    private double valor;

    // Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double reajuste() {
        return valor * 1.05;
    }
}
