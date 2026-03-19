package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        // Data atual
        LocalDate now = LocalDate.now();

        // Data atual + 2 anos e + 7 dias
        LocalDate nowAfterTwoYears = LocalDate.now()
                .plusYears(2)
                .plusDays(7);

        // --------------------------------------------------------------------
        // Period representa um período baseado em DATA (anos, meses, dias)
        // Diferente de Duration, que trabalha com tempo (horas, segundos)

        // Diferença entre duas datas
        Period p1 = Period.between(now, nowAfterTwoYears);
        // Resultado esperado: P2Y7D (2 anos e 7 dias)

        // Criando períodos manualmente
        Period p2 = Period.ofDays(10);     // 10 dias
        Period p3 = Period.ofWeeks(58);    // 58 semanas
        Period p4 = Period.ofMonths(3);    // 3 meses
        Period p5 = Period.ofYears(3);     // 3 anos

        // --------------------------------------------------------------------

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        // ATENÇÃO:
        // Period.ofWeeks(58) NÃO guarda "semanas" internamente
        // Ele converte tudo para DIAS (58 semanas = 406 dias)

        // Por isso:
        System.out.println(p3.getMonths());
        // Resultado: 0 (não há meses armazenados)

        // Aqui pegamos apenas os dias de p3
        // p3.getDays() = 406

        System.out.println(
                Period.between(
                        LocalDate.now(),
                        LocalDate.now().plusDays(p3.getDays())
                ).getDays()
        );
    }
}