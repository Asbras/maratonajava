package thisleo.maratonajava;

public class Aula06EstruturasDeRepeticao04 {
    // Usando um break para sair de um laço de repetição
    // Dado um valor de um carro, descubra em quantos valores de parcelamento
    // Condição valorParcela ≥ 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela "+ parcela +"R$ "+valorParcela);
            } else {
                break;
            }
        }
    }
}
