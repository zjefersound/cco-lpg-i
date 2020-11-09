import java.util.Scanner;

public class ex_01 {
  
  /**
   * Faça um programa que, dados 2 vetores, 
   * gere um terceiro com todos os valores 
   * ordenados de maneira decrescente.
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int[] vet = new int[5];
    int[] vet2 = new int[5];
    int[] vet3 = new int[10];

    System.out.println("Leia o primeiro vetor");
    for (int index = 0; index < vet.length; index++) {
      vet[index] = keyboard.nextInt();
    }
    
    System.out.println("Leia o segundo vetor");
    for (int index = 0; index < vet2.length; index++) {
      vet2[index] = keyboard.nextInt();
    }
    
    for (int index = 0; index < vet.length; index++) {
      vet3[index] = vet[index];
      vet3[index + vet.length] = vet2[index];
    }

    for (int index = 0; index < vet3.length; index++) {
      for (int index2 = index; index2 < vet3.length; index2++) {
        if (vet3[index] < vet3[index2]) {
          int number = vet3[index];
          vet3[index] = vet3[index2];
          vet3[index2] = number;
        }
      }
    }

    System.out.println("SELECT * ORDER BY valueOf DESC");
    for (int index = 0; index < vet3.length; index++) {
      System.out.println(vet3[index]);
    }

    keyboard.close();
  }
}
