package maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {

    /*
     * Este exemplo demonstra o uso da classe StringBuilder em Java.
     *
     * Conceitos importantes:
     *
     * 1) Strings em Java são imutáveis. Métodos como concat() não alteram a
     *    String original, eles retornam um novo objeto String.
     *
     * 2) StringBuilder é uma classe mutável, criada para permitir alterações
     *    no conteúdo sem a necessidade de criar novos objetos a cada operação.
     *
     * 3) Por isso, StringBuilder é mais eficiente quando precisamos fazer
     *    várias modificações em uma String.
     *
     * 4) O tamanho inicial padrão do buffer interno do StringBuilder é
     *    16 caracteres (quando não é definido explicitamente).
     *
     * 5) Métodos como append(), reverse() e delete() permitem modificar
     *    diretamente o conteúdo armazenado no buffer.
     */

    public static void main(String[] args) {

        // String comum (imutável)
        String nome = "William Suane";

        // concat() retorna uma nova String, mas o resultado não foi armazenado
        nome.concat(" DevDojo");

        // A String original permanece inalterada
        System.out.println(nome); // saída: William Suane


        // StringBuilder utiliza um buffer mutável
        StringBuilder sb = new StringBuilder("William Suane");

        // append adiciona texto ao final do buffer
        sb.append(" DevDojo").append(" Academy");

        // reverse inverte os caracteres da sequência
        sb.reverse();

        // delete remove caracteres entre os índices especificados
        // neste caso remove os caracteres de índice 0 até 2
        sb.delete(0, 3);

        System.out.println(sb);
    }
}