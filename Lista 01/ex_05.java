import java.util.Scanner;

public class ex_05 {
  /**
    • a hora trabalhada vale a metade do salário mínimo;
    • o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
    hora trabalhada;
    • o imposto equivale a 3% do salário bruto;
    • o salário a receber equivale ao salário bruto menos o imposto
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    float salarioMinimo, salarioBruto, salarioFinal, valorHora, horasTrabalhadas, imposto;

    //porcentagem
    imposto = 3;
    
    System.out.println("Digite o salário mínimo:");
    salarioMinimo = keyboard.nextFloat();
   
    System.out.println("Digite o numero de horas trabalhadas:");
    horasTrabalhadas = keyboard.nextFloat();

    valorHora = salarioMinimo / 2;
    salarioBruto = valorHora * horasTrabalhadas;
    salarioFinal = (100 - imposto) / 100 * salarioBruto;

    System.out.println("Salário a receber: "+salarioFinal);
  }
}