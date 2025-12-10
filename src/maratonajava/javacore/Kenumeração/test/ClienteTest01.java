package maratonajava.javacore.Kenumeração.test;

import maratonajava.javacore.Kenumeração.domain.Cliente;
import maratonajava.javacore.Kenumeração.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
