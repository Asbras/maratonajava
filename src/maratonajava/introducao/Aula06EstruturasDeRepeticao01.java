package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        // Use while quando você NÃO sabe quantas vezes o loop vai repetir,
        // e quer verificar a condição antes de executar o bloco.
        while (count < 10) {
            System.out.println(count++);
        }

        count = 0;
        // Use do while quando você precisa que o bloco execute pelo menos uma vez
        // antes de verificar a condição.
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        // Use for quando você sabe exatamente quantas vezes o loop deve repetir.
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
