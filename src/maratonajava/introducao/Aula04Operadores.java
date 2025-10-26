package maratonajava.introducao;

public class Aula04Operadores {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("b - a = "+(b-a));
        System.out.println("b + a = "+(b+a));
        System.out.println("b * a = "+(b*a));
        System.out.println("b / a = "+(b/a));

        // módulo é um operador que resulta no resto da divisão, é bem utilizada para verificar se o numero é par ou impar.
        int resto = 23 % 2;
        System.out.println(resto);

        // Em Java, quando você cria uma variável do tipo boolean, é comum que o nome comece com is, has ou can.
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte: "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte: "+isDezDiferenteQueVinte);

        // %% (AND), || (OR), ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade >= 30 && salario >= 4612;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrent = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrent > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlaystationCompravel "+isPlaystationCompravel);
    }
}
