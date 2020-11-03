import java.util.Scanner;

public class ex_03 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double salario, salarioFinal, imposto, gratificacao;
    
    //porcentagem
    imposto = 7;
    gratificacao = 5;
    
    System.out.println("Digite o seu salário:");
    salario = keyboard.nextDouble();
    salarioFinal = (100+gratificacao-imposto)/100*salario;

    System.out.println("Salario Final:"+salarioFinal);
    keyboard.close();
  }
}
