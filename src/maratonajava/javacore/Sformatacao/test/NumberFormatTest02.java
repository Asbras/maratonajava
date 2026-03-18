package maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        // Criação de diferentes Locales (idioma + país)
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        // Array de NumberFormat para armazenar diferentes formatações de moeda
        NumberFormat [] nfa = new NumberFormat[4];

        // Formato de moeda usando o Locale padrão do sistema
        nfa[0] = NumberFormat.getCurrencyInstance();

        // Formato de moeda para o Japão
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);

        // Formato de moeda para o Brasil
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);

        // Formato de moeda para a Itália
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        // Valor que será formatado (uso de underscore para facilitar leitura)
        double valor = 1_000.2130;

        // Percorre cada formatador
        for (NumberFormat numberFormat : nfa) {

            // Mostra o número máximo de casas decimais que o formato utiliza
            System.out.println(numberFormat.getMaximumFractionDigits());

            // Formata o valor de acordo com o Locale (moeda, separadores, etc)
            System.out.println(numberFormat.format(valor));
        }
    }
}