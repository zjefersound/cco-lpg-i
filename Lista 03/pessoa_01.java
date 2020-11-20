import java.util.Scanner;

public class pessoa_01 {
  /**
   * Pessoa loja varejista
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
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

  public MostrarPessoa() {
    System.out.println("cpf: "+this.cpf);
    System.out.println("nome: "+this.nome);
    System.out.println("telefone: "+this.telefone);
    System.out.println("email: "+this.email);
    System.out.println("endereco: "+this.endereco);
  }

  public CadastrarPessoa(String cpf, String nome, String telefone, String email, String endereco) {
    this.cpf = cpf;
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.endereco = endereco;
    System.out.println("Criou");
  }

  public AlterarPessoa(String cpf, String nome, String telefone, String email, String endereco) {
    this.cpf = cpf;
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.endereco = endereco;
    System.out.println("Alterou");
  }
  
  public DeletarPessoa(String cpf) {
    if (this.cpf == cpf) {
      System.out.println("Deletou");
    }
  }
};