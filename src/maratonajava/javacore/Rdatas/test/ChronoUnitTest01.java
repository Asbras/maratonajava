package maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        // Data de aniversário (ano, mês, dia, hora, minuto, segundo)
        LocalDateTime aniversario = LocalDateTime.of(1992, Month.JUNE, 20, 12, 0, 0);

        // Data e hora atual
        LocalDateTime now = LocalDateTime.now();

        // ChronoUnit é usado para medir diferença entre datas/tempos em unidades específicas

        // Diferença em dias
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));

        // Diferença em semanas
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));

        // Diferença em meses
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));

        // Diferença em anos
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}