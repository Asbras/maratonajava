package maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    public void somarDoisNumeros(float a, float b) {
        System.out.println( a + " + " + b + " = " + (a + b));
    }

    public void subtrairDoisNumeros(float a, float b) {
        System.out.println( a + " - " + b + " = " + (a - b));
    }

    public void multiplicarDoisNumeros(float a, float b) {
        System.out.println( a + " * " + b + " = " + (a * b));
    }

    public void dividirDoisNumeros(float a, float b) {
        if (b == 0){
            System.out.println("Erro, não ha divisão por zero");
            return;
        }
        System.out.println( a + " / " + b + " = " + (a / b));
    }

    public void alteraDoisNumeros (int a, int b) {
        a = 99;
        b = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
