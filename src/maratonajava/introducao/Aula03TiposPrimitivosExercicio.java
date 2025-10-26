package maratonajava.introducao;
/*
* Prática
*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
*
* Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
*
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Leonardo Carnio Della Torre";
        String adress = "Avenida Benedito Rodrigues Pinheiro";
        double salary = 2000.50;
        String dateReceived = "23/12/2025";
        String fullMessage = "Eu "+name+", morando no endereço "+adress+", confirmo que recebi o salario de "+salary+", na data "+dateReceived;
        
        System.out.println("Eu "+name+", morando no endereço "+adress+", confirmo que recebi o salario de "+salary+", na data "+dateReceived);
        System.out.println(fullMessage);
        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o salario de %.2f, na data %s", name, adress, salary, dateReceived);
    }
}
