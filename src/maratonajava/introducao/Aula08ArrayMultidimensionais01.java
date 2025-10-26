package maratonajava.introducao;

public class Aula08ArrayMultidimensionais01 {
   /*
    Em Java, um array multidimensional (como int[][]) é um array de arrays, onde o array principal armazena referências
    (endereços de memória) para os arrays internos, que podem ter tamanhos diferentes (arrays "irregulares").
    */
    public static void main(String[] args) {
        // 1,2,3,4,5 meses em números
        // 31,28,31,30 total de dia em cada mes
       int [][] dias = new int[3][3];
       
       dias[0][0] = 31;
       dias[0][1] = 31;
       dias[0][2] = 31;
       
       dias[1][0] = 31;
       dias[1][1] = 31;
       dias[1][2] = 31;

       // Imprimir os valores do array multidimensional  usando for convencional
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        // Imprimir os valores dos array multidimensional usado foreach
        for (int [] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
