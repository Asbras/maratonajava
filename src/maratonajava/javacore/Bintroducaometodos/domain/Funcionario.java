package maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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
