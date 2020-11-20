import java.util.Scanner;

public class buzz_01 {
  /**
   * Buzz Lightyear:
   * 
   * Capacete retrátil 
   * 6 frases 
   * Dispara Laser 
   * Braço articulado para golpes 
   * Abre as asas
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int quantidadeBuzz = 3;
    int inputOptionNumber;
    Buzz[] buzzes = new Buzz[quantidadeBuzz];

    // Instanciando cada Buzz
    for (int i = 0; i < quantidadeBuzz; i++) {
      buzzes[i] = new Buzz();
    }

    do {
      System.out.println("\n\n\n");
      System.out.println("Voce tem " + quantidadeBuzz + " buzzes!");
      System.out.println("Escolha um numero de 1 a " + quantidadeBuzz);
      System.out.println("(digite 0 para sair)");
      inputOptionNumber = keyboard.nextInt();
      if (inputOptionNumber == 0) break;
      if (inputOptionNumber <= quantidadeBuzz) {
        int buzzAtual = inputOptionNumber - 1;
        listaOpcoes();
        inputOptionNumber = keyboard.nextInt();
        executaOpcoes(buzzes[buzzAtual],inputOptionNumber);
      } else {
        System.out.println("Digite um numero valido");
      }
    } while (inputOptionNumber != 0);
    System.out.println("Sistema encerrado");
    keyboard.close();
  }

  public static void listaOpcoes() {
    System.out.println("Escolha uma opcao:");
    System.out.println("1.Falar frase");
    System.out.println("2.Abrir capacete");
    System.out.println("3.Articular braco");
    System.out.println("4.Abrir asas");
    System.out.println("5.Dispara laser");
    System.out.println("6.Status do Buzz");
  }

  public static void executaOpcoes(Buzz buzz, int opcao) {
    switch (opcao) {
      case 1: 
        buzz.falarFrase();
        break;
      case 2: 
        buzz.abrirCapacete();
        break;
      case 3: 
        buzz.articularBraco();
        break;
      case 4: 
        buzz.abrirAsas();
        break;
      case 5: 
        buzz.disparaLaser();
        break;
      case 6: 
        buzz.getStatus();
        break;
    }
  }
}

class Buzz {
  private boolean isCapaceAberto;
  private boolean isAsasAbertas;
  private String[] frases = new String[6];
  private int indexFraseAtual;

  public Buzz() {
    this.isCapaceAberto = false;
    this.isAsasAbertas = false;
    this.indexFraseAtual = 0;
    this.frases = new String[] { "Ao infinito e alem!",
        "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!", "Isto não é voar. Isto é cair, com estilo!",
        "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.",
        "Deus não é aquilo que vai no infinito e no além. O nome disso é Buzz Lightyear. Deus é outra coisa.",
        "Isso eh porque eu tava testando ele" };
  }

  public void disparaLaser() {
    System.out.println("TCHUMMM! Laser disparado");
  }

  public void articularBraco() {
    System.out.println("Bracos prontos para atacar!");
  }

  public void abrirCapacete() {
    this.isCapaceAberto = true;
    System.out.println("Capacete aberto!");
  }
  
  public void abrirAsas() {
    this.isAsasAbertas = true;
    System.out.println("Asas abertas!");
  }

  public void falarFrase() {
    String frase = frases[indexFraseAtual] != null ? frases[indexFraseAtual] : "Frase nao encontrada.";
    System.out.println(frase);
    this.indexFraseAtual++;
    if (this.indexFraseAtual == frases.length) indexFraseAtual = 0;
  }

  public void getStatus() {
    System.out.println("STATUS DO BUZZ:");
    System.out.println("Capacete aberto:" + (this.isCapaceAberto ? "sim" : "nao"));
    System.out.println("Asas abertas:" + (this.isAsasAbertas ? "sim" : "nao"));
  }
};
