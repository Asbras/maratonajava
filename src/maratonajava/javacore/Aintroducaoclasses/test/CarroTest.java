package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); // nova INSTANCIA carro1
        Carro carro2 = new Carro(); // nova INSTANCIA carro2

        carro1.nome ="Fusca";
        carro1.modelo="Sport";
        carro1.ano = 1969;

        carro2.nome ="Gol";
        carro2.modelo="Sport";
        carro2.ano = 2015;

        System.out.println("Carro 1:");
        System.out.println("Nome: " + carro1.nome + " modelo: " + carro1.modelo + " ano: " + carro1.ano);
        System.out.println("\nCarro 2:");
        System.out.println("Nome: " + carro2.nome + " modelo: " + carro2.modelo + " ano: " + carro2.ano);
    }
}