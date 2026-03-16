package maratonajava.javacore.Qstring.test;

public class StringTest02 {

    /*
     * Este exemplo demonstra alguns métodos importantes da classe String em Java.
     *
     * 1) Strings em Java são objetos e possuem diversos métodos para manipulação de texto.
     * 2) O método length() retorna a quantidade de caracteres presentes na String,
     *    incluindo espaços.
     * 3) O método replace() retorna uma nova String com caracteres substituídos.
     * 4) Os métodos toLowerCase() e toUpperCase() retornam novas Strings convertendo
     *    todas as letras para minúsculas ou maiúsculas.
     * 5) O método substring() permite extrair apenas uma parte da String.
     * 6) O método trim() remove espaços em branco no início e no fim da String.
     * 7) Strings são imutáveis em Java, ou seja, nenhum desses métodos altera a
     *    String original; todos retornam um novo objeto String.
     */

    public static void main(String[] args) {

        // String com espaços antes e depois do nome
        String nome = "     Luffy     ";

        String numeros = "012345";


        // length() conta TODOS os caracteres da String, incluindo espaços.
        // Neste caso existem 5 espaços antes + 5 letras + 5 espaços depois.
        // Total = 15 caracteres.
        System.out.println(nome.length());


        // replace troca todos os caracteres "f" por "l"
        System.out.println(nome.replace("f", "l"));


        // converte todas as letras para minúsculas
        System.out.println(nome.toLowerCase());


        // converte todas as letras para maiúsculas
        System.out.println(nome.toUpperCase());


        // quantidade de caracteres da string de números
        System.out.println(numeros.length());


        // substring(3) retorna a String a partir do índice 3
        // índices: 0 1 2 3 4 5
        // valores: 0 1 2 3 4 5
        // resultado: "345"
        System.out.println(numeros.substring(3));


        // trim remove espaços no início e no final da String
        // "     Luffy     " -> "Luffy"
        // Isso é útil principalmente quando lidamos com dados digitados por usuários
        // ou dados vindos de banco de dados, pois espaços extras podem causar erros
        // em comparações ou consultas.
        System.out.println(nome.trim());
    }
}