package maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando funcionário");
    }
}