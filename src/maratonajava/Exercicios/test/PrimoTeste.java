package maratonajava.Exercicios.test;

import maratonajava.Exercicios.domain.Primo;

public class PrimoTeste {
    public static void main(String[] args) {
        Primo primo = new Primo();

        System.out.println("1 - " + primo.isPrime(1));  // false
        System.out.println("2 - " + primo.isPrime(2));  // true
        System.out.println("3 - " + primo.isPrime(3));  // true
        System.out.println("4 - " +primo.isPrime(4));  // false (pelo %2)
        System.out.println("9 - " +primo.isPrime(9));  // false (encontra i=3)
        System.out.println("17 - " +primo.isPrime(17));
        System.out.println("1703 - " +primo.isPrime(1703));
    }
}
