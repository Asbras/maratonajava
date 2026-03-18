package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        // Classe antiga Date (representa data e hora atual)
        System.out.println(new Date());

        // Classe antiga Calendar (mais completa que Date, mas também considerada legacy)
        System.out.println(Calendar.getInstance());

        // Retorna o valor numérico do mês de janeiro (1)
        System.out.println(Month.JANUARY.getValue());

        // Cria uma data específica (ano, mês, dia)
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);

        // Obtém a data atual do sistema
        LocalDate agora = LocalDate.now();

        // Retorna o ano da data
        System.out.println(date.getYear());

        // Retorna o mês em formato numérico (1 a 12)
        System.out.println(date.getMonthValue());

        // Retorna o dia da semana (ex: MONDAY, TUESDAY)
        System.out.println(date.getDayOfWeek());

        // Retorna o dia do mês
        System.out.println(date.getDayOfMonth());

        // Retorna a quantidade de dias do mês (ex: 28, 30, 31)
        System.out.println(date.lengthOfMonth());

        // Verifica se o ano é bissexto
        System.out.println(date.isLeapYear());

        // Acessa o ano usando ChronoField (forma mais genérica)
        System.out.println(date.get(ChronoField.YEAR));

        // Acessa o dia do mês usando ChronoField
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        // Imprime a data no formato padrão (yyyy-MM-dd)
        System.out.println(date);

        // Imprime a data atual
        System.out.println(agora);

        // Maior data suportada pelo LocalDate
        System.out.println(LocalDate.MAX);

        // Menor data suportada pelo LocalDate
        System.out.println(LocalDate.MIN);
    }
}