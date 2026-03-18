package maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        // Não é possível instanciar diretamente a classe Calendar (ela é abstrata)
        Calendar c = Calendar.getInstance();

        // Calendar.SUNDAY é uma constante inteira que indica o primeiro dia da semana (depende da região)
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }

        // Imprime o dia da semana (valor numérico de 1 a 7)
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        // Imprime o dia do mês
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        // Imprime o dia do ano
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        // Imprime a ocorrência do dia da semana no mês (ex: segunda terça-feira do mês)
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        // Adiciona 2 dias ao dia atual do mês (ajustando corretamente mês/ano se necessário)
        c.add(Calendar.DAY_OF_MONTH, 2);

        // Incrementa 12 horas, mas sem alterar campos maiores (como o dia)
        c.roll(Calendar.HOUR, 12);

        // Converte o Calendar para Date para exibição mais legível
        Date date = c.getTime();
        System.out.println(date);
    }
}