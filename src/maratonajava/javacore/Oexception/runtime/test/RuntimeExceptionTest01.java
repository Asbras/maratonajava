package maratonajava.javacore.Oexception.runtime.test;

import java.io.FileReader;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) throws Exception {

        // Checked - obriga tratamento, não compila sem try/catch ou throws
        try {
            FileReader file = new FileReader("arquivo.txt");
        } catch (Exception e) {
            System.out.println("Checked - " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        // Unchecked - compila, mas quebra em tempo de execução
        try {
            Object obj = null;
            obj.toString();
        } catch (NullPointerException e) {
            System.out.println("Unchecked - NullPointerException: " + e.getMessage());
        }

        try {
            int[] nums = {1, 2};
            System.out.println(nums[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked - ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}


