package maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios (double[] salarios) {
        this.salarios = salarios;
    }
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalarios () {
        return this.salarios;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
        System.out.println("Salários: ");
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
        }
        System.out.println();
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
             media += salario;
        }
        media /= salarios.length;

        System.out.printf("Média salários: %.2f R$", media);
    }
}
