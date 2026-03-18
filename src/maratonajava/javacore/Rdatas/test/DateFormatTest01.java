package maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); // saida: 3/18/26, 4:14 PM
        df[1] = DateFormat.getDateInstance(); // saida: Mar 18, 2026
        df[2] = DateFormat.getDateTimeInstance(); // saida: Mar 18, 2026, 4:14:36 PM
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // saida: 3/18/26
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // saida: Mar 18, 2026
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); // saida: March 18, 2026
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // saida: Wednesday, March 18, 2026

        for (DateFormat dateFormat: df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
