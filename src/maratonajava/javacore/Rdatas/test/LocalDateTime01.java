package maratonajava.javacore.Rdatas.test;

// Importações das classes da API de datas do Java (java.time)
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime01 {
    public static void main(String[] args) {

        // Retorna a data e hora atual do sistema
        LocalDateTime localDateTime = LocalDateTime.now();

        // Converte uma String no formato ISO (yyyy-MM-dd) para um objeto LocalDate
        LocalDate date = LocalDate.parse("2022-08-06");

        // Converte uma String no formato ISO (HH:mm:ss) para um objeto LocalTime
        LocalTime time = LocalTime.parse("09:45:00");

        // Exibe a data e hora atual
        System.out.println(localDateTime);

        // Exibe apenas a data
        System.out.println(date);

        // Exibe apenas o horário
        System.out.println(time);

        // Combina uma data com um horário, criando um LocalDateTime
        LocalDateTime ldt1 = date.atTime(time);

        // Outra forma de combinar (mesmo resultado que acima)
        LocalDateTime ldt2 = time.atDate(date);

        // Exibe o resultado da combinação (data + hora)
        System.out.println(ldt1);

        // Exibe o resultado da segunda forma (igual ao anterior)
        System.out.println(ldt2);
    }
}