package maratonajava.Exercicios.Exercicio07.domain;

// Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
public class VerificaBooleanos {
    private boolean bol1;
    private boolean bol2;

    public void setBol1(boolean bol1) {
        this.bol1 = bol1;
    }

    public void setBol2(boolean bol2) {
        this.bol2 = bol2;
    }

    public void checarBoleanos() {
        if (bol1 && bol2) {
            System.out.println("Ambos são verdadeiros");
        } else if (!bol1 && !bol2) {
            System.out.println("Ambos são falsos");
        } else if (bol1) {
            System.out.println("O primeiro é verdadeiro e o segundo é falso");
        } else {
            System.out.println("O primeiro é falso e o segundo é verdadeiro");
        }
    }
}
