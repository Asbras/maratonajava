package thisleo.maratonajava;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        if(!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        // Não é correto fazer, porém, pode cair em prova
        boolean c = true;
        // o sinal de igual não é uma comparação dentro do if, mas sim uma atribuição
        if (c= false) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
