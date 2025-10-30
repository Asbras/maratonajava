package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "João";
        estudante01.idade = 34;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}