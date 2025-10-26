package maratonajava.introducao;

public class Aula07Arrays01 {
    // Programa que cria um array de inteiros para armazenar idades,
    // inicializa seus elementos e exibe os valores usando um loop for.
    public static void main(String[] args) {
        // Declara e inicializa um array de inteiros com tamanho 3 para armazenar idades
        int[] idades = new int[3];

        // Atribui valores às posições do array
        idades[0] = 15; // Primeira idade
        idades[1] = 20; // Segunda idade
        idades[2] = 17; // Terceira idade

        // Itera sobre o array e imprime cada idade
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade na posição " + i + ": " + idades[i]);
        }
    }
}