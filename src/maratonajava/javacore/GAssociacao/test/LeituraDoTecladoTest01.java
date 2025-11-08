package maratonajava.javacore.GAssociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine(); // Le uma linha inteira
        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite o seu sexo(M/F)");
        char sexo = entrada.next().charAt(0); // primeiro caracter (0) da mensagem escrita
        System.out.println("---------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
//        System.out.printf("Nome: %s%nIdade: %d%nSexo: %c%n", nome, idade, sexo);
    }
}
