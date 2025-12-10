package maratonajava.Exercicios.Exercicio01.domain;

public class Impressora {
    private String nome;
    private int idade;
    private String mensagem;

    public Impressora(String nome, int idade, String mensagem) {
        this.nome = nome;
        this.idade = idade;
        this.mensagem = mensagem;
    }

    public void imprimirMensagem() {
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos e gostaria de dizer a seguinte mensagem: " + mensagem);
    }
}
