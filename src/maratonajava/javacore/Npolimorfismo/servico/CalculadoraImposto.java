package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.domain.Produto;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    // Widening cast
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        // Narrowing cast
        // só vai acontecer se o produto for uma instância de tomate
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate)produto).getDataValidade();
            System.out.println("Data de validade: " + dataValidade);
        }
    }
}
