package maratonajava.Exercicios.Exercicio02.domain;

public class CalculadoraBasica {
    // Exercício:
    // Crie uma calculadora básica com métodos que recebam dois números e retornem o resultado das seguintes operações:
    // 1. Soma
    // 2. Subtração
    // 3. Multiplicação
    // 4. Divisão (com casas decimais)
    public double somar(double a, double b) {
        return a + b;
    }


    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }


    public double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
