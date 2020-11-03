import java.util.Scanner;

public class ex_09 {
  /**
   * Faça um programa que receba dez números inteiros e mostre a quantidade de
   * números primos dentre os número que foram digitados
   */
  static boolean isPrimeNumber(int number){
    boolean isPrime = true;
    for (int index = 2; index < number; index++) {
      if (number % index == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int quantidadePrimos = 0;

    System.out.println("Digite 10 numeros:");

    for (int index = 0; index < 10; index++) {
      int numero = keyboard.nextInt();
      if (isPrimeNumber(numero)) quantidadePrimos++;
    }

    System.out.println("qtd de primos:"+quantidadePrimos);

    keyboard.close();
  }
}