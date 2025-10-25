package thisleo.maratonajava;

public class Aula06EstruturasDeRepeticao05 {
    // Programa que calcula e exibe as parcelas de um valor total de R$ 30.000,
    // mostrando apenas as parcelas com valor igual ou superior a R$ 1.000,
    // utilizando um loop for e a instrução continue.
    public static void main(String[] args) {
        double valorTotal = 30000;
        // Loop que itera de valorTotal até 1, representando o número de parcelas
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            // Calcula o valor de cada parcela dividindo o total pelo número de parcelas
            double valorParcela = valorTotal / parcela;

            // Verifica se o valor da parcela é menor que R$1.000
            if (valorParcela < 1000) {
                continue; // Pula para a próxima iteração, ignorando parcelas abaixo de R$ 1.000
            }

            // Exibe o número da parcela e seu valor, formatado com duas casas decimais
            System.out.printf("Parcela %d: R$ %.2f%n", parcela, valorParcela);
        }
    }
}
