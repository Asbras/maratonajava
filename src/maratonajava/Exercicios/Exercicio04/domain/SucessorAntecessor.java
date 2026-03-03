package maratonajava.Exercicios.Exercicio04.domain;

// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
public class SucessorAntecessor {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int imprimirSucessor() {
        return numero + 1;
    }

    public int imprimirAntecessor() {
        return  numero - 1;
    }
}
