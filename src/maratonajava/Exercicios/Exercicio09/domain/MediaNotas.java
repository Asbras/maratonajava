package maratonajava.Exercicios.Exercicio09.domain;

public class MediaNotas {
    // Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    private double[] notas = new double[3];

    public MediaNotas(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double media=0;
        for (int i=0; i< notas.length; i++) {
            System.out.printf("Nota %d: %.2f\n", (i+1), notas[i]);
            media = media + notas[i];
        }
        return media/3;
    }
}
