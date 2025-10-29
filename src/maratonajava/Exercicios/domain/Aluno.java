package maratonajava.Exercicios.domain;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public void verificarAprovacao() {
        double media = (nota1 + nota2) / 2;
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 3) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println(); // Pular uma linha para organizar melhor a saída
    }


}
