package maratonajava.Exercicios.Exercicio08.domain;

public class IMC {
    /*
    * Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
    de acordo com a tabela abaixo:
        Fórmula do IMC = peso / (altura) ²
        *  ____________________________________________________
        * | Abaixo de 18,5      | Abaixo do peso               |
        * | Entre 18,6 e 24,9   | Peso ideal (parabéns)        |
        * | Entre 25,0 e 29,9   | Levemente acima do peso      |
        * | Entre 30,0 e 34,9   | Obesidade grau I             |
        * | Entre 35,0 e 39,9   | Obesidade grau II (severa)   |
        * | Maior ou igual a 40 | Obesidade grau III (mórbida) |
    */
    private double peso;
    private double altura;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void categorizarIMC(double imc) {
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III");
        }
    }
 }
