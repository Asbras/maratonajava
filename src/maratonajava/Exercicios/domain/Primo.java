package maratonajava.Exercicios.domain;

public class Primo {
    // Crie um metodo que checa se um número é primo ou não. Caso seja primo retorne true, caso não retorne false;
    public boolean isPrime(int numero) {
        // Se o número é menor que dois, ele não eh um primo
        if (numero < 2) {
            return false;
        }
        // Se o número for igual a dois ele é primo
        if (numero == 2) {
            return true;
        }
        // Se um número é par, ele não é primo
        if (numero % 2 == 0) {
            return false;
        }
        // Testar se há algum divisor do número 2 até numero/2
        for (int i = 2; i <= numero/2; i++) {
            // Se houver um divisor, quer dizer que o número não é primo, po para ser primo deve-se ter como divisor
            // somente 1 e o próprio número
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
