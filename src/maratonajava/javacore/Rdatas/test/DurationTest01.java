package maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {

        // Data e hora atual
        LocalDateTime now = LocalDateTime.now();

        // Data e hora atual + 2 anos e + 8 minutos
        LocalDateTime nowAfterTwoYears = LocalDateTime.now()
                .plusYears(2)
                .plusMinutes(8);

        // Hora atual (sem data)
        LocalTime timeNow = LocalTime.now();

        // Hora atual menos 7 horas
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);

        // Duration representa uma quantidade de tempo (horas, minutos, segundos...)
        // NÃO trabalha com datas diretamente (anos/meses podem ser problemáticos)

        // Diferença entre duas datas com hora (LocalDateTime)
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        // Resultado esperado: aproximadamente 2 anos e alguns minutos em segundos

        // Diferença entre dois horários (LocalTime)
        Duration d2 = Duration.between(timeNow, timeMinusSevenHours);
        // Aqui pode dar um valor NEGATIVO dependendo do horário atual
        // Exemplo: se agora é 10h, e você tira 7h → 03h (do mesmo dia),
        // então o Duration vai ser negativo

        // Diferença entre dois instantes (momento exato na linha do tempo - UTC)
        Duration d3 = Duration.between(
                Instant.now(),
                Instant.now().plusSeconds(1000)
        );
        // Resultado: 1000 segundos

        // Criando uma duração fixa de 20 dias
        Duration d4 = Duration.ofDays(20);

        // Criando uma duração fixa de 3 minutos
        Duration d5 = Duration.ofMinutes(3);

        // Impressão dos resultados
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}