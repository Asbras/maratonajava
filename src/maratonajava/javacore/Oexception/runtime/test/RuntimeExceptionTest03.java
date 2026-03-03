package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // vai sempre ser executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally { // vai sempre ser executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
