import java.util.Scanner;

public class ex_05 {

  /**
   * Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
   * com sete posições cada um que contenham, respectivamente, o maior elemento de
   * cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
   * e os dois vetores gerados.
   */

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int length = 3;

    int[][] matriz = new int[length][length];
    int[] biggestRowElements = new int [length];
    int[] smallestColumnElements = new int [length];

    System.out.println("Leia a matriz");
    for (int row = 0; row < matriz.length; row++) {
      for (int column = 0; column < matriz[row].length; column++) {
        System.out.print("Leia o campo ["+row+","+column+"]");
        matriz[row][column] = keyboard.nextInt();
      }
    }
    
    for (int row = 0; row < matriz.length; row++) {
      int biggest = matriz[row][0];
      for (int column = 0; column < matriz[row].length; column++) {
        if (matriz[row][column] > biggest) {
          biggest = matriz[row][column];
        }
      }
      biggestRowElements[row] = biggest;
    }
    
    for (int column = 0; column < matriz.length; column++) {
      int smallest = matriz[0][column];
      for (int row = 0; row < matriz[0].length; row++) {
        if (matriz[row][column] < smallest) {
          smallest = matriz[row][column];
        }
      }
      smallestColumnElements[column] = smallest;
    }

    System.out.println("Matriz lida: ");
    for (int row = 0; row < matriz.length; row++) {
      for (int column = 0; column < matriz[row].length; column++) {
        System.out.print(matriz[row][column]);
      }
      System.out.println("");
    }

    System.out.println("MAIORES ROWS ELEMENTOS");
    for (int row = 0; row < biggestRowElements.length; row++) {
      System.out.println(biggestRowElements[row]);
    }

    System.out.println("MENORES COLUMNS ELEMENTOS");
    for (int column = 0; column < smallestColumnElements.length; column++) {
      System.out.println(smallestColumnElements[column]);
    }

    keyboard.close();
  }
}
