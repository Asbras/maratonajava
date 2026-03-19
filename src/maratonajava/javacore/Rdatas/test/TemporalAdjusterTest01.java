package maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

// Classe que implementa um ajustador personalizado
// Objetivo: sempre retornar o PRÓXIMO DIA ÚTIL (segunda a sexta)
class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        // Obtém o dia da semana a partir do objeto temporal
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays;

        // Lógica:
        // Se for perto do final de semana, pula direto para segunda
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4; // quinta -> segunda
                break;
            case FRIDAY:
                addDays = 3; // sexta -> segunda
                break;
            case SATURDAY:
                addDays = 2; // sábado -> segunda
                break;
            default:
                addDays = 1; // outros dias -> próximo dia normal
        }

        // Retorna a nova data com os dias adicionados
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {

        // Teste simples com data atual
        LocalDate now = LocalDate.now();
        System.out.println("Hoje: " + now + " - " + now.getDayOfWeek());

        now = now.with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil: " + now + " - " + now.getDayOfWeek());

        System.out.println("\n=== TESTE COMPLETO (todos os dias da semana) ===");

        // Data base: segunda-feira conhecida
        LocalDate base = LocalDate.of(2024, 6, 17); // essa data é uma segunda

        // Loop por todos os dias da semana
        for (int i = 0; i < 7; i++) {
            LocalDate data = base.plusDays(i);

            LocalDate proximoDiaUtil = data.with(new ObterProximoDiaUtil());

            System.out.println(
                    "Dia atual: " + data.getDayOfWeek() +
                            " (" + data + ")" +
                            " -> Próximo dia útil: " +
                            proximoDiaUtil.getDayOfWeek() +
                            " (" + proximoDiaUtil + ")"
            );
        }
    }
}