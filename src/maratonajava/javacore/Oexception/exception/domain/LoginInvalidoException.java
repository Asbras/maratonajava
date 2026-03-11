package maratonajava.javacore.Oexception.exception.domain;

public class LoginInvalidoException extends Exception {
    // Mensagem padrão
    public LoginInvalidoException() {
        super("Login inválido");
    }

    // Mensagem customizada
    public LoginInvalidoException(String message) {
        super(message);
    }
}
