package maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {

        // Criação de diferentes Locales (idioma + país), no caso de brasil seria pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH"); // Italiano na Suíça
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        // Obtém a data atual baseada no sistema
        Calendar calendar = Calendar.getInstance();

        // Cria formatadores de data no padrão FULL (formato completo) para cada região
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        // Formata e imprime a data atual conforme cada Locale
        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suiça " + df2.format(calendar.getTime()));
        System.out.println("India " + df3.format(calendar.getTime()));
        System.out.println("Japao  " + df4.format(calendar.getTime()));
        System.out.println("Holanda " + df5.format(calendar.getTime()));

        // Retorna o nome do país do Locale (no idioma padrão do sistema)
        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeCH.getDisplayCountry(localeHolanda));

        // mostra o nome do idioma italiano em japonês
        System.out.println(localeItaly.getDisplayLanguage(localeJapao));
    }
}