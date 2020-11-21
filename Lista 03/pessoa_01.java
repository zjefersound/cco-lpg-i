import java.util.Scanner;

public class pessoa_01 {
  /**
   * Pessoa loja varejista
   */

  public static void ColetarDadosCadastro(Pessoa pessoa) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Comece criando um usuario:");

    System.out.println("Digite o cpf:");
    String cpf = keyboard.nextLine();

    System.out.println("Digite o nome:");
    String nome = keyboard.nextLine();

    System.out.println("Digite o telefone:");
    String telefone = keyboard.nextLine();

    System.out.println("Digite o email:");
    String email = keyboard.nextLine();

    System.out.println("Digite o endereco:");
    String endereco = keyboard.nextLine();

    pessoa.CadastrarPessoa(cpf, nome, telefone, email, endereco);
  }
  
  public static void ColetarDadosAlteracao(Pessoa pessoa) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Digite os dados que quer alterar");
    System.out.println("Caso nao queira aperte Enter");

    System.out.println("Digite o cpf:");
    String cpf = keyboard.nextLine();

    System.out.println("Digite o nome:");
    String nome = keyboard.nextLine();

    System.out.println("Digite o telefone:");
    String telefone = keyboard.nextLine();

    System.out.println("Digite o email:");
    String email = keyboard.nextLine();

    System.out.println("Digite o endereco:");
    String endereco = keyboard.nextLine();

    pessoa.AlterarPessoa(cpf, nome, telefone, email, endereco);
  }
  
  public static void ColetarDadosExclusao(Pessoa pessoa) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Digite o cpf:");
    String cpf = keyboard.nextLine();

    pessoa.DeletarPessoa(cpf);
  }

  public static void listaOpcoes() {
    System.out.println("Escolha uma acao");
    System.out.println("0. Sair");
    System.out.println("1. Editar");
    System.out.println("2. Mostrar");
    System.out.println("3. Excluir");
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int inputOptionNumber = 0;
    Pessoa pessoa = new Pessoa();
    ColetarDadosCadastro(pessoa);
    do {
      listaOpcoes();
      inputOptionNumber = keyboard.nextInt();
      switch (inputOptionNumber) {
        case 1:
          ColetarDadosAlteracao(pessoa);
          break;
        case 2:
          pessoa.MostrarPessoa();
          break;
        case 3:
          ColetarDadosExclusao(pessoa);
          break;
      }
    } while (inputOptionNumber != 0);
    System.out.println("Sistema encerrado");

    keyboard.close();
  }
}

class Pessoa {
  private String cpf;
  private String nome;
  private String telefone;
  private String email;
  private String endereco;

  public Pessoa() {

  }

  public void MostrarPessoa() {
    System.out.println("cpf: " + this.cpf);
    System.out.println("nome: " + this.nome);
    System.out.println("telefone: " + this.telefone);
    System.out.println("email: " + this.email);
    System.out.println("endereco: " + this.endereco);
  }

  public void CadastrarPessoa(String cpf, String nome, String telefone, String email, String endereco) {
    this.cpf = cpf;
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.endereco = endereco;
    System.out.println("Criou");
  }

  public void AlterarPessoa(String cpf, String nome, String telefone, String email, String endereco) {
    this.cpf = !cpf.isEmpty() ? cpf : this.cpf;
    this.nome = !nome.isEmpty() ? nome : this.nome;
    this.telefone = !telefone.isEmpty() ? telefone : this.telefone;
    this.email = !email.isEmpty() ? email : this.email;
    this.endereco = !endereco.isEmpty() ? endereco : this.endereco;
    System.out.println("Alterou");
  }

  public void DeletarPessoa(String cpf) {
    if (cpf.equalsIgnoreCase(this.cpf)) {
      this.cpf = null;
      this.nome = null;
      this.telefone = null;
      this.email = null;
      this.endereco = null;
      System.out.println("Deletou");
    } else {
      System.out.println("CPF invalido");
    }
  }
};