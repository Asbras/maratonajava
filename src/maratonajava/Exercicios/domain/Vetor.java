package maratonajava.Exercicios.domain;

public class Vetor {
    public void duplicarVetor(int[] vetor) {
//         Usando for
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println(vetor[i] * 2);
//        }
        // usando foreach
        System.out.println("Vetor original: ");
        for (int v : vetor) {
            System.out.println(v);
        }
        System.out.println("Vetor duplicado: ");
        for (int n : vetor) {

            System.out.println(n * 2);
        }
    }
}
