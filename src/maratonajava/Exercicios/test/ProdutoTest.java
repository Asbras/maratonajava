package maratonajava.Exercicios.test;

import maratonajava.Exercicios.domain.Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner entrada = new Scanner(System.in);

        produto.nome = "Saco de Arroz 5kg";
        produto.preco = 14.45;
        produto.quantidade = 0;

        int opcao;
        do {
            produto.menu();
            opcao = entrada.nextInt();
                switch (opcao) {
                    case 0:
                        System.out.println("Saindo");
                        break;
                    case 1:
                        System.out.println("Quantidade do produto a ser vendida: ");
                        int quantidadeVenda = entrada.nextInt();
                        produto.vender(quantidadeVenda);
                        break;
                    case 2:
                        System.out.println("Quantidade do produto para reposição de estoque: ");
                        int quantidadeReposta = entrada.nextInt();
                        produto.reporEstoque(quantidadeReposta);
                        break;
                    case 3:
                        produto.exibirInfo();
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                }
        } while (opcao != 0);
    }
}
