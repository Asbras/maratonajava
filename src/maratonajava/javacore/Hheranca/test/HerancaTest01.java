package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Endereco;
import maratonajava.javacore.Hheranca.domain.Funcionario;
import maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("111111-111");
        Pessoa pessoa = new Pessoa("Maria Silva");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("---------------------------------");

        Funcionario funcionario = new Funcionario("Jão Marcos");
        funcionario.setCpf("2222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1200);
        funcionario.imprime();
        System.out.println("---------------------------------");
    }
}
