package thisleo.maratonajava;

public class Aula05EstruturasCondicionais06 {
   public static void main (String[] args) {
       // Utilizando o switch e dados o s valores de 1 a 7, imprima se o dia é útil ou final de semana
       // Considere 1 como domingo
       byte diaDaSemana = 3;
       switch (diaDaSemana) {
           case 1:
               System.out.println("final de semana");
               break;
           case 2:
               System.out.println("dia útil");
               break;
           case 3:
               System.out.println("dia útil");
               break;
           case 4:
               System.out.println("dia útil");
               break;
           case 5:
               System.out.println("dia útil");
               break;
           case 6:
               System.out.println("dia útil");
               break;
           case 7:
               System.out.println("final de semana");
               break;
           default:
               System.out.println("Opção inválida");
       }

//       também pode ser feito assim
//       switch (diaDaSemana) {
//           case 1:
//               System.out.println("final de semana");
//               break;
//           case 7:
//               System.out.println("final de semana");
//               break;
//           case 2:
//           case 3:
//           case 4:
//           case 5:
//           case 6:
//               System.out.println("dia útil");
//               break;
//           default:
//               System.out.println("Opção inválida");
//       }
   }
}
