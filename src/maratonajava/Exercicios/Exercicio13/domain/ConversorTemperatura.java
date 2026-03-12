package maratonajava.Exercicios.Exercicio13.domain;

public class ConversorTemperatura {
    //Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
    // Imprima na tela as duas temperaturas.
    //Fórmula: C = (5 * ( F-32) / 9)
    private double temperaturaFahrenheit;

    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public double converterTemperatura() {
        return 5*(temperaturaFahrenheit-32)/9;
    }
}
