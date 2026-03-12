package maratonajava.Exercicios.Exercicio13.test;

import maratonajava.Exercicios.Exercicio13.domain.ConversorTemperatura;

import java.util.Scanner;

public class ConversorTemperaturaTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConversorTemperatura test = new ConversorTemperatura();

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperatura = entrada.nextDouble();
        test.setTemperaturaFahrenheit(temperatura);

        System.out.printf("%.2f Fahrenheit em Celsius é: %.2f", temperatura, test.converterTemperatura());
        entrada.close();
    }

}
