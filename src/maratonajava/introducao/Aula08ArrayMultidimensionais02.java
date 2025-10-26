package maratonajava.introducao;

public class Aula08ArrayMultidimensionais02 {
    // Programa que demonstra a criação e manipulação de um array multidimensional irregular em Java.
    // Conceitos cobertos:
    // - Arrays multidimensionais: Em Java, são arrays de arrays, onde o array principal armazena referências
    //   a arrays internos, permitindo tamanhos diferentes (irregulares), ao contrário de C, onde arrays
    //   multidimensionais são blocos contínuos de memória com tamanhos fixos.
    // - Inicialização de arrays: Arrays podem ser inicializados com tamanhos fixos ou valores diretos.
    // - Loop for-each: facilita a iteração sobre arrays, acessando elementos diretamente sem usar índices.

    public static void main(String[] args) {
        // Declara um array multidimensional com 3 linhas, mas sem definir os tamanhos das colunas (array irregular)
        int[][] arrayInt = new int[3][];

        // Inicializa as linhas do array com tamanhos diferentes, demonstrando a flexibilidade de arrays irregulares
        arrayInt[0] = new int[2]; // Linha 0 com 2 elementos (inicializados com 0 por padrão)
        arrayInt[1] = new int[]{1, 2, 3}; // Linha 1 com 3 elementos, inicializados diretamente
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6}; // Linha 2 com 6 elementos, inicializados diretamente
        // Nota: Em Java, ao inicializar diretamente com valores (new int[]{…}), não se especifica o tamanho
        // explicitamente (ex.: new int[6] seria incorreto), pois o tamanho é inferido da lista de valores.

        // Itera sobre o array principal usando for-each, acessando cada array interno (linha)
        for (int[] arrBase : arrayInt) {
            System.out.println("\n-----------------");
            for (int num : arrBase) {
                System.out.print(num + " "); // Imprime o número seguido de um espaço, sem quebrar a linha
            }
        }
    }
}

