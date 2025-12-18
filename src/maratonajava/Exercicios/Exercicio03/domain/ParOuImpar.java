package maratonajava.Exercicios.Exercicio03.domain;

public class ParOuImpar {
    // Exercício: determine se um número é par ou ímpar

    public void paridade(int num) {
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }
    }
}
