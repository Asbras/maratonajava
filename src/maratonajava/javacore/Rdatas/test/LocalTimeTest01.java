package maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        // Cria um horário específico (hora, minuto, segundo)
        LocalTime time = LocalTime.of(23, 32, 12);

        // Obtém o horário atual do sistema
        LocalTime timeNow = LocalTime.now();

        // Imprime o horário definido
        System.out.println(time);

        // Imprime o horário atual
        System.out.println(timeNow);

        // Retorna a hora (0 a 23)
        System.out.println(time.getHour());

        // Retorna os minutos (0 a 59)
        System.out.println(time.getMinute());

        // Retorna os segundos (0 a 59)
        System.out.println(time.getSecond());

        // Acessa a hora usando ChronoField (forma mais genérica)
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));

        // Menor horário possível (00:00)
        System.out.println(LocalTime.MIN);

        // Maior horário possível (23:59:59.999999999)
        System.out.println(LocalTime.MAX);
    }
}