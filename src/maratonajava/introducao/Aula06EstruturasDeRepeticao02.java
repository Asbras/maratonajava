package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima os numeros pares de 0 até 1.000.000
        for (int i=0; i<=1_000_000; i++) {
            // Verificar se o i é par
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
