import java.util.Scanner;

public class ex_04 {
  /**
    o valor de cada quilowatt;
    o valor a ser pago por essa residência;
    o valo a ser pago com 15% de desconto
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    float salarioMinimo, quantidadeKw, kw, custoResidencia, desconto, custoResidenciaComDesconto;

    //porcentagem
    desconto = 15;
    
    System.out.println("Digite o salário mínimo:");
    salarioMinimo = keyboard.nextFloat();

    System.out.println("Digite a quantidade de Quilowatts:");
    quantidadeKw = keyboard.nextFloat();

    kw = salarioMinimo / 5;
    custoResidencia = quantidadeKw * kw;

    custoResidenciaComDesconto = (100-desconto)/100*custoResidencia;

    System.out.println("Valow KW:"+kw);
    System.out.println("Custo da Residencia:"+custoResidencia);
    System.out.println("Custo da Residencia com "+desconto+"%:"+custoResidenciaComDesconto);
  }
}