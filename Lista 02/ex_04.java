import java.util.Scanner;

public class ex_04 {

  /**
   * Faça um programa que simule um controle bancário. Para tanto, devem ser lidos
   * os códigos de dez contas e seus respectivos saldos. Os códigos devem ser
   * armazenados em um vetor de números inteiros (não pode haver mais de uma conta
   * com o mesmo código) e os saldos devem ser armazenados em um vetor de números
   * reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo,
   * se a conta 504 foi armazenada na quinta posição do vetor de códigos, seu
   * saldo deverá ficar na quinta posição do vetor de saldos. Depois de fazer a
   * leitura dos valores, deverá aparecer o seguinte menu na tela: • Efetuar
   * depósito • Efetuar saque • Consultar o ativo bancário (soma de todos os
   * saldos) • Finalizar programa
   */

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] codContas = new int[10];
    float[] saldoContas = new float[10];

    System.out.println("Leia o cod das contas");
    for (int index = 0; index < codContas.length; index++) {
      codContas[index] = keyboard.nextInt();
    }

    System.out.println("Leia o saldo das contas");
    for (int index = 0; index < saldoContas.length; index++) {
      saldoContas[index] = keyboard.nextFloat();
    }

    int exit = 1;
    do {
      System.out.println("1. Efetuar deposito");
      System.out.println("2. Efetuar saque");
      System.out.println("3. Consultar ativo");

      int option = keyboard.nextInt();

      switch (option) {
        case 1:
          System.out.println("Codigo da conta:");
          int cod = keyboard.nextInt();
          
          System.out.println("Saldo:");
          float saldo = keyboard.nextFloat();
          
          for (int i = 0; i < codContas.length; i++) {
            if (codContas[i] == cod) {
              saldoContas[i] += saldo;
            }
          }

          break;
        case 2:
          System.out.println("Codigo da conta:");
          int codSaque = keyboard.nextInt();
          
          System.out.println("Saldo:");
          float saldoSaque = keyboard.nextFloat();
          
          for (int i = 0; i < codContas.length; i++) {
            if (codContas[i] == codSaque) {
              if (saldoContas[i] > saldoSaque) {
                saldoContas[i] -= saldoSaque;
              } else {
                System.out.println("Saldo insuficiente:");
              }
            }
          }

          break;
        case 3:
          float totalSaldos = 0;
          for (int i = 0; i < saldoContas.length; i++) {
            totalSaldos += saldoContas[i];
          }
          System.out.println("Saldo total: "+totalSaldos); 
          break;
      }

      System.out.println("Digite 0 para sair");
      exit = keyboard.nextInt();
    } while (exit != 0);

    keyboard.close();
  }
}
