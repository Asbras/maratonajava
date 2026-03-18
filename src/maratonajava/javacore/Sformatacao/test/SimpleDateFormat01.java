package maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {

        // Define o padrão de formatação da data
        // Texto entre aspas simples ('') é tratado como literal (não é interpretado como data)
        // dd = dia do mês
        // MMMM = nome completo do mês
        // yyyy = ano
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy"; // Ex: Amsterdam 18 de March de 2026

        // Cria o formatador com base no padrão definido
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        // Formata a data atual para String seguindo o padrão
        System.out.println(sdf.format(new Date()));

        try {
            // Converte (parse) a String para um objeto Date com base no mesmo padrão
            System.out.println(sdf.parse("Amsterdam 18 de March de 2026"));
        } catch (ParseException e) {

            // Exceção lançada caso a String não esteja no formato esperado
            e.printStackTrace();
        }
    }
}