package maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // retorna um long
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
