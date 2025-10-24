package thisleo.maratonajava;

public class Aula05EstruturasCondicionais04 {
    public static void main (String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 0.097; //9.7%
        double segundaFaixa = 0.3735; // 37.35%
        double terceiraFaixa = 0.495; // 49.5%
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34712 && salarioAnual <= 68657) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Valor a pagar de imposto de renda = "+ valorImposto);
    }
}
