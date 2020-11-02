import java.util.Scanner;

public class ex_03 {
  /**
   * ax*x + bx + c
   * Delta = b**2 -4 * a * c
   * (-b +- sqrt(Delta))/2a
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double salario, salarioFinal, imposto, gratificacao;
    
    //porcentagem
    imposto = 7;
    gratificacao = 5;
    
    System.out.println("Digite o seu salário:");
    salario = keyboard.nextFloat();
    salarioFinal = (100+gratificacao-imposto)/100*salario;

    System.out.println("Salario Final:"+salarioFinal);
  }
}
