package maratonajava.javacore.Fmodificadorestatico.domain;

/**
 * Regras de boas práticas para métodos e atributos static:
 * <ul>
 *   <li>Use <code>static</code> quando o comportamento não depende do estado de uma instância
 *       (não acessa/modifica atributos de objeto com <code>this</code>).</li>
 *   <li>Aplicável a funcionalidades utilitárias, constantes lógicas ou configurações globais.</li>
 *   <li>Evite <code>static</code> em métodos que alteram o estado do objeto.</li>
 * </ul>
 * <p>
 * </p>
 */

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250; // por ser static, se esse valor for alterado, a alteração vai ocorrer em todas as instâncias de Carro

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("---------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
