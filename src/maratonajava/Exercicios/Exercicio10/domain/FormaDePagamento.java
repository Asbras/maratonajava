package maratonajava.Exercicios.Exercicio10.domain;

public class FormaDePagamento {
    // Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da
    // forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da
    // tabela de condições de pagamento para efetuar o cálculo adequado.
    // Tabela Pagamento:
    // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    // 2 - À Vista no cartão de crédito, recebe 10% de desconto
    // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularValor(int opt) {
        if (opt == 1) { // A vista
            return valor * 0.85;
        } else if (opt == 2) { // Cartão de crédito
            return valor * 0.9;
        } else if (opt == 3) { // Cartão de crédito parcelado em 2x
            return valor;
        } else if (opt == 4){ // Cartão de crédito parcelado 3x ou mais
            return valor * 1.1;
        } else {
            throw new IllegalArgumentException("Forma de pagamento inválida");
        }
    }
}
