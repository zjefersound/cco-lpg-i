import java.util.Scanner;

public class ex_08 {
  /**
   * Em um campeonato de futebol existem cinco times e cada um possui 11
   * jogadores. Faça um programa que receba a idade, o peso e a altura de cada um
   * dos jogadores, calcule e mostre: 
   *  • a quantidade de jogadores com idade inferior a 18 anos; 
   *  • a média das idades dos jogadores de cada time; 
   *  • a média das alturas de todos os jogadores do campeonato; 
   *  • a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato.
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int nTimes = 5;
    int nJogadoresPorTime = 11;
    int totalJogadores = nJogadoresPorTime * nTimes;
    Jogador[][] jogadores = new Jogador[nTimes][nJogadoresPorTime];

    //vars de controle
    int qtdMenorDeIdade = 0;
    float totalIdades = 0;
    float totalAlturas = 0;
    float totalMais80 = 0;

    for (int time = 0; time < jogadores.length; time++) {
      System.out.println("TIME:" + time);
      for (int jogador = 0; jogador < jogadores[time].length; jogador++) {
        System.out.println("Jogador:" + jogador);

        System.out.println("Digite a idade:");
        int inputIdade = keyboard.nextInt();

        System.out.println("Digite a altura:");
        float inputAltura = keyboard.nextFloat();

        System.out.println("Digite o peso:");
        float inputPeso = keyboard.nextFloat();

        jogadores[time][jogador] = new Jogador(inputIdade, inputAltura, inputPeso);

        if (jogadores[time][jogador].getIdade() < 18)
          qtdMenorDeIdade++;

        totalIdades += jogadores[time][jogador].getIdade();
        totalAlturas += jogadores[time][jogador].getAltura();

        if (jogadores[time][jogador].getPeso() > 80)
          totalMais80++;
      }
    }

    System.out.println("Menores de 18 anos: " + qtdMenorDeIdade);
    System.out.println("Media idades: " + (totalIdades / totalJogadores));
    System.out.println("Media alturas: " + (totalAlturas / totalJogadores));
    System.out.println("Percentual + 80kg: " + (totalMais80 / totalJogadores * 100) + "%");

    keyboard.close();
  }
}

class Jogador {
  private int idade;
  private float altura;
  private float peso;

  public Jogador() {
    this.idade = 0;
    this.altura = 0;
    this.peso = 0;
  }

  public Jogador(int i, float a, float p) {
    this.idade = i;
    this.altura = a;
    this.peso = p;
  }

  public void setIdade(int value) {
    this.idade = value;
  }

  public void setAltura(float value) {
    this.altura = value;
  }

  public void setPeso(float value) {
    this.peso = value;
  }

  public int getIdade() {
    return this.idade;
  }

  public float getAltura() {
    return this.altura;
  }

  public float getPeso() {
    return this.peso;
  }
};