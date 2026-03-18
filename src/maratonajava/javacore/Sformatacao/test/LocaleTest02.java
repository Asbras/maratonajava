package maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {

        // Retorna o Locale padrão do sistema (idioma + país)
        System.out.println(Locale.getDefault());

        // Retorna um array com todos os códigos ISO de países (ex: BR, US, JP)
        String[] isoCountries = Locale.getISOCountries();

        // Retorna um array com todos os códigos ISO de idiomas (ex: pt, en, ja)
        String[] isoLanguages = Locale.getISOLanguages();

        // Percorre e imprime todos os códigos de idiomas
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println(); // quebra de linha

        // Percorre e imprime todos os códigos de países
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

    }
}