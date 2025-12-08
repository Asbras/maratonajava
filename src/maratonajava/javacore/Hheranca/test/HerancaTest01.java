package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Endereco;
import maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("111111-111");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome Sobrenome");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        System.out.println(pessoa.toString());
    }
}
