package maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtrai(double a, double b) {
        return a - b;
    }

    public double multiplica(double a, double b) {
        return a *  b;
    }

    /**
     * Divide a por b.
     * @param a numerador
     * @param b denominador
     * @return resultado da divisão
     * @throws ArithmeticException se b for zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            // Regra matemática: divisão por zero é indefinida
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return  a / b;
    }

    public void  somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma do array: " + soma);
    }

    // Regra do Java: varargs (...) deve ser sempre o último parâmetro do método
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma com VarArgs: " + soma);
    }
}
