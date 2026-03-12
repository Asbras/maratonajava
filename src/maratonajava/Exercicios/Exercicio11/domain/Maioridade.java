package maratonajava.Exercicios.Exercicio11.domain;

public class Maioridade {
    // Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou
    // menor de idade.
    private String nome;
    private int idade;
    private double peso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}
