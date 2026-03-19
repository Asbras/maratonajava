package maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {

        // Data atual
        LocalDate now = LocalDate.now();

        // Altera apenas o dia do mês para 18 (mantém mês e ano)
        now = now.with(ChronoField.DAY_OF_MONTH, 18);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Próxima quinta-feira OU a atual (se hoje já for quinta)
        now = LocalDate.now()
                .with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Próxima quinta-feira (sempre pula para a próxima, nunca fica no mesmo dia)
        now = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Quinta-feira anterior
        now = LocalDate.now()
                .with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Primeiro dia do mês atual
        now = LocalDate.now()
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Último dia do mês atual
        now = LocalDate.now()
                .with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Primeiro dia do próximo ano
        now = LocalDate.now()
                .with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Primeiro dia do próximo mês
        now = LocalDate.now()
                .with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}