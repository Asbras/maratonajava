package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computador;
import maratonajava.javacore.Npolimorfismo.domain.Produto;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("--------------");
        // Quando voce criar um tomate a partir do produto, não é possível acessar data de validade
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
