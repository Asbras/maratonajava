package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Crie um programa que use while para somar todos os números de 1 até 100 e imprima o resultado
    public static void main(String[] args) {
        int count = 1;
        int soma = 0;
        while (count <= 100){
            soma += count;
            count++;
        }
        System.out.println(soma);
    }
}
