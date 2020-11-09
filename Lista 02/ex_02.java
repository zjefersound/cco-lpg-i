import java.util.Scanner;

public class ex_02 {
  /**
   * Faça um programa que, dados 
   * 2 vetores com 10 números inteiros cada, 
   * gere e imprima um vetor dos números não comuns aos vetores
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] vet1 = new int[10], vet2 = new int[10], vet3 = new int[20];
    int contVet3 = 0;

    System.out.println("Leia o primeiro vetor");
    for (int index = 0; index < vet1.length; index++) {
      vet1[index] = keyboard.nextInt();
    }
    
    System.out.println("Leia o segundo vetor");
    for (int index = 0; index < vet2.length; index++) {
      vet2[index] = keyboard.nextInt();
    }

    for (int index = 0; index < vet1.length; index++) {
      boolean distinto = true;
      boolean distinto2 = true;

      for (int index2 = 0; index2 < vet2.length; index2++) {
        if (vet1[index] == vet2[index2]) distinto = false;
        if (vet2[index] == vet1[index2]) distinto2 = false;
      }

      if (distinto) {
        vet3[contVet3] = vet1[index];
        contVet3++;
      }
      if (distinto2) {
        vet3[contVet3] = vet2[index];
        contVet3++;
      }
    }
    
    System.out.println("Esses são os números q não estão nos dois vetores");
    for (int index = 0; index < contVet3; index++) {
      System.out.println(vet3[index]);
    }

    keyboard.close();
  }
}
