package maratonajava.Exercicios.domain;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void exibirInfo() {
        System.out.println("\nNome do produto: " + nome + "\nPreço: " + preco + "\nQuantidade em estoque: " + quantidade + "\n");
    }

    public void vender(int quantidadeVendida) {
        if (quantidade <= 0 || (quantidadeVendida > quantidade)) {
            System.out.println("ESTOQUE INSUFICIENTE!!!!\n");
            return;
        }
        System.out.println("------ VENDA REALIZADA COM SUCESSO ------");
        quantidade -= quantidadeVendida;
    }

    public void reporEstoque(int quantidadeAdicionada) {
        quantidade += quantidadeAdicionada;
        System.out.println("------ REPOSIÇÃO DE ESTOQUE FEITA COM SUCESSO ------");
    }

    public void menu() {
        System.out.println("Digite:\n1 - Vender\n2 - Repor\n3 - Exibir Informações\n0 - Sair\nOpção: ");
    }
}
