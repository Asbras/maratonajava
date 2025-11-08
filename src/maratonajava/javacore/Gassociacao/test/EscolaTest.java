package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Escola;
import maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor professor3 = new Professor("Pedro");
        Professor[] professores = {professor1, professor2, professor3};
        
        Escola escolaA = new Escola("Escola de São Paulo");
        // A lista de professores virá de fora
        // Simulando uma chamada e rebento a lista professores
        escolaA.setProfessores(professores);
        escolaA.imprime();

    }
}
