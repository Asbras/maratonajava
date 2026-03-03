package maratonajava.Exercicios.Exercicio05.domain;

// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule quantos salários mínimos esseusuário ganha e imprima na tela o resultado.
// (Base para o Salário mínimo R$ 1.293,20).
public class SalarioMinimo {
   private static final double SALARIO_MINIMO = 1293.20;
   private double salario;

   public void setSalario(double salario) {
       this.salario = salario;
   }

   public double calcularQuantidadeSalariosMinimos() {
       return salario / SALARIO_MINIMO;
   }
}
