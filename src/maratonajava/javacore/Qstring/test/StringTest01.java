package maratonajava.javacore.Qstring.test;

public class StringTest01 {
    // ‘Strings’ em Java são imutáveis (não podem ser alteradas após criadas)

    public static void main(String[] args) {

        // String literal armazenada no String Constant Pool
        String nome = "William";

        // Reutiliza o mesmo objeto do pool
        String nome2 = "William";

        // concat cria um objeto ‘String’ (a original não é alterada)
        nome = nome.concat(" Suane");

        System.out.println(nome); // William Suane

        // == compara referências de memória (não o conteúdo)
        System.out.println(nome == nome2); // false

        // Cria um objeto ‘String’ explicitamente no heap
        String nome3 = new String("William");

        // false porque nome2 aponta para o pool e nome3 para um novo objeto no heap
        System.out.println(nome2 == nome3);

        // intern() retorna a referência da ‘String’ armazenada no pool
        // agora ambas apontam para o mesmo objeto
        System.out.println(nome2 == nome3.intern()); // true
    }
}