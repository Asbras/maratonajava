package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zorro", 12000);
        Gerente gerente = new Gerente("tonto", 5000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
