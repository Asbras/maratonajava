package maratonajava.Exercicios.Exercicio11.test;

import maratonajava.Exercicios.Exercicio11.domain.Maioridade;

import java.util.Scanner;

public class MaioridadeTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Maioridade teste = new Maioridade();

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        teste.setIdade(idade);
        teste.setNome(nome);
        teste.setPeso(peso);

        if (teste.isMaiorDeIdade()) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}
