package maratonajava.Exercicios.test;

import maratonajava.Exercicios.domain.Aluno;
import maratonajava.Exercicios.domain.Local;
import maratonajava.Exercicios.domain.Professor;
import maratonajava.Exercicios.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjas");
        Aluno aluno = new Aluno("joão", 25);
        Professor professor = new Professor("Maria", "Matemática");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Seminario 1", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminariosMinistrados(seminariosDisponiveis);
        professor.imprime();
    }
}
