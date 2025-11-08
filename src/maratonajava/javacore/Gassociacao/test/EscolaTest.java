package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Escola;
import maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Escola de São Paulo", professores);

        escola.imprime();
    }
}
