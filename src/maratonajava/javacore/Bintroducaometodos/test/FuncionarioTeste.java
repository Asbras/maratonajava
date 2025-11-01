package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

import java.util.Arrays;

public class FuncionarioTeste {
    /*
    Crie uma classe Funcionário com os seguintes atributos:
    1. nome
    2. salario
    3. idade
    Crie dois métodos:
    1. Para imprimir os dados do funcionário
    2. Para tirar a média dos salários dos últimos meses
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setIdade(34);
        funcionario.setNome("João");
        // como o atributo salário é um vetor é necessário passar os valores como um vetor
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salários: " + Arrays.toString(funcionario.getSalarios()));
        funcionario.imprimeMediaSalario();
    }
}
