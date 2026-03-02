package maratonajava.Exercicios.Exercicio02.domain;

// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou
// negativo.
public class ClassificaNumero {
    private int num;

    // setter para o num
    public void setNum(int num) {
        this.num = num;
    }

    // Testar se o número é par ou impar
    public boolean isPar() {
        return num % 2 == 0;
    }

    // Testar se o numero é positivo
    public boolean isPositivo() {
        return num >= 0;
    }

}
