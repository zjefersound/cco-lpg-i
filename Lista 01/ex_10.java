import java.util.ArrayList;
import java.util.Scanner;

public class ex_10 {
  /**
   * Faça um programa que leia um conjunto não determinado de valores, um de cada
   * vez, e escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte
   * linhas. A tabela deverá conter o valor lido, seu cubo e sua raiz quadrada.
   * Finalize quando a entrada for um número negativo ou 0.
   */

  static void printTableHeader() {
    System.out.format("%15s%15s%15s\n", "num", "quad", "raiz");
  }

  static void printTable(ArrayList<Integer> numbers) {
    System.out.flush();

    for (int index = 0; index < numbers.size(); index++) {
      if (index % 20 == 0) printTableHeader();

      int num = numbers.get(index);
      double quad = Math.pow(num,2);
      double raiz = Math.sqrt(num);
      System.out.format("%15d%15f%15f\n", num, quad, raiz);
    }
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    int inputNumero;
    do {
      printTable(numeros);
      inputNumero = keyboard.nextInt();
      numeros.add(inputNumero);
    } while (inputNumero > 0);

    keyboard.close();
  }
}