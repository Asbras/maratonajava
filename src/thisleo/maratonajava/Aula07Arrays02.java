package thisleo.maratonajava;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Declara um array de Strings com tamanho 3, inicializado com null por padrão
        // Em Java, arrays de tipos primitivos (byte, short, int, long, float, double) são inicializados com 0,
        // char com um caractere vazio (''), boolean com false, e objetos (como String) com null
        String[] nomes = new String[3];

        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "Sebastião";

        // Itera sobre o array para exibir o valor de cada posição
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posição " + i + ": " + nomes[i]);
        }
    }
}