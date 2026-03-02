package maratonajava.Exercicios.Exercicio01.dominio;

// Classe responsável por armazenar os valores A, B e C,
// calcular a soma de A + B e verificar se essa soma é menor que C.
public class SomaMenorQueC {

    // Atributos da classe (estado do objeto)
    private double a;     // valor A
    private double b;     // valor B
    private double c;     // valor C
    private double total; // resultado da soma A + B

    // Método responsável por calcular a soma de A e B
    // O resultado é armazenado no atributo 'total'
    public void soma() {
        total = a + b;
    }

    // Método que imprime o resultado da soma na tela
    public void imprimeSoma() {
        System.out.println("A + B = " + total);
    }

    // Método que verifica se a soma (A + B) é menor que C
    // e imprime o resultado da comparação
    public void verificaSeSomaMenorQueC() {
        if (total < c) {
            System.out.println("A soma de A e B é menor que C");
        } else {
            System.out.println("A soma de A e B NÃO é menor que C");
        }
    }

    // ===== GETTERS E SETTERS =====
    // Métodos utilizados para acessar e modificar os atributos privados

    // Retorna o valor de C
    public double getC() {
        return c;
    }

    // Define o valor de C
    public void setC(double c) {
        this.c = c;
    }

    // Retorna o valor de B
    public double getB() {
        return b;
    }

    // Define o valor de B
    public void setB(double b) {
        this.b = b;
    }

    // Retorna o valor de A
    public double getA() {
        return a;
    }

    // Define o valor de A
    public void setA(double a) {
        this.a = a;
    }
}
