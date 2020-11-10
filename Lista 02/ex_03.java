import java.util.Scanner;

public class ex_03 {

  /**
   * Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
   * com sete posições cada um que contenham, respectivamente, o maior elemento de
   * cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
   * e os dois vetores gerados.
   */

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] vet1 = new int[10], vet2 = new int[5];
    int[] res1 = new int[10], res2 = new int[10];
    int contRes1 = 0, contRes2 = 0;

    System.out.println("Leia o primeiro vetor");
    for (int index = 0; index < vet1.length; index++) {
      vet1[index] = keyboard.nextInt();
    }

    System.out.println("Leia o segundo vetor");
    for (int index = 0; index < vet2.length; index++) {
      vet2[index] = keyboard.nextInt();
    }


    //vetor res1 
    for (int index = 0; index < vet1.length; index++) {
      if ( (float) vet1[index] % 2 == 0 ) {
        res1[contRes1] = vet1[index];
        contRes1++;
      }
    }

    for (int index = 0; index < contRes1+1; index++) {
      res1[index] += somaVetor(vet2);
    }

    //vetor res2 
    for (int index = 0; index < vet1.length; index++) {
      if ( (float) vet1[index] % 2 != 0 ) {
        res2[contRes2] = vet1[index];
        contRes2++;
      }
    }

    for (int index = 0; index < contRes2+1; index++) {
      res2[index] = getNumDivisores(res2[index], vet2);
    }


    System.out.println("Res 1:");
    for (int index = 0; index < contRes1; index++) {
      System.out.println(res1[index]);
    }
    
    System.out.println("Res 2:");
    for (int index = 0; index < contRes2; index++) {
      System.out.println(res2[index]);
    }




    keyboard.close();
  }

  public static int somaVetor(int[] vetor) {
    int soma = 0;
    for (int index = 0; index < vetor.length; index++) {
      soma += vetor[index];
    }
    return soma;
  } 
  public static int getNumDivisores(int num, int[] vetor) {
    int divisores = 0;

    for (int index = 0; index < vetor.length; index++) {
      if ((float) num % (float) vetor[index] == 0) {
        divisores++;
      }
    }

    return divisores;
  } 
}
