package maratonajava.Exercicios.test;

import maratonajava.Exercicios.domain.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        // verificar condição Aprovado
        aluno.nome = "Leon";
        aluno.nota1 = 6.5;
        aluno.nota2 = 9;
        // verificar condição Recuperação
        aluno2.nome = "João";
        aluno2.nota1 = 6.5;
        aluno2.nota2 = 3.0;
        // verificar condição Reprovado
        aluno3.nome = "Maria";
        aluno3.nota1 = 4.5;
        aluno3.nota2 = 0.0;

        aluno.verificarAprovacao();
        aluno2.verificarAprovacao();
        aluno3.verificarAprovacao();
    }
}
