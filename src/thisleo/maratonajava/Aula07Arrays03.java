package thisleo.maratonajava;

public class Aula07Arrays03 {
    public static void main(String[] args){
        int[] numeros = new int[3]; // criar um objeto vetor com os valores padrões, no caso 0 em todas as posições
        int[] numeros2 = {1,2,3,4,5}; // criar um objeto vetor e iniciá-los com valores.

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }
        // Versão simplificada do for acima chamado de foreach
        for(int num:numeros2){
            System.out.println(numeros2);
        }
    }
}
