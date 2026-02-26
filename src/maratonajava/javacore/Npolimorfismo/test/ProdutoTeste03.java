package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computador;
import maratonajava.javacore.Npolimorfismo.domain.Produto;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
