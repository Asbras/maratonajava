package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se o salário for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu tenho condições de doar";
        String mensagemNaoDoar = "Eu tenho condições de doar";
        // Sintaxe do operador ternário (condição) ? verdadeiro : falso
        String resultado = salario > 500 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
