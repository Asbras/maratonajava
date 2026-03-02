package maratonajava.javacore.Oexception.error.test;

// Quando acontece um erro que acontece na JVM que não é possível recuperar em tempo de execução
public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
