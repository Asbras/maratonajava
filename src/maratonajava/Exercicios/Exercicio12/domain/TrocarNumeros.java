package maratonajava.Exercicios.Exercicio12.domain;

public class TrocarNumeros {
    //  Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A eimprima na tela
    //  os valores.
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void trocarNumeros() {
        double aux = this.a;
        this.a = b;
        this.b = aux;
    }

}
