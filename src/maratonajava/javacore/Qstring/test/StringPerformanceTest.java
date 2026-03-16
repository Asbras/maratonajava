package maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    /*
     * Este exemplo demonstra a diferença de performance entre três abordagens
     * de concatenação de texto em Java: String, StringBuilder e StringBuffer.
     *
     * Conceitos importantes:
     *
     * 1) Strings em Java são imutáveis. Quando uma String é modificada,
     *    um novo objeto é criado na memória.
     *
     * 2) Em loops, concatenações com "+" podem gerar muitos objetos temporários,
     *    o que aumenta o consumo de memória e reduz a performance.
     *
     * 3) StringBuilder e StringBuffer utilizam um buffer mutável, permitindo
     *    modificar o conteúdo sem criar novos objetos a cada operação.
     *
     * 4) StringBuilder é mais rápido porque não possui sincronização interna.
     *
     * 5) StringBuffer é thread-safe (sincronizado), sendo mais seguro em ambientes
     *    com múltiplas threads, porém um pouco mais lento.
     *
     * 6) System.currentTimeMillis() é usado aqui para medir o tempo de execução
     *    de cada abordagem.
     */

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + " ms");
    }


    public static void concatString(int tamanho) {
        // Concatenação usando String (gera novos objetos a cada iteração)
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }


    public static void concatStringBuilder(int tamanho) {
        // Uso de buffer mutável para evitar criação constante de objetos
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }


    public static void concatStringBuffer(int tamanho) {
        // Versão sincronizada do StringBuilder (thread-safe)
        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}