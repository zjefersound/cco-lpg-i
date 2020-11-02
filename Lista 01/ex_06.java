import java.util.Scanner;

public class ex_06 {
  /**
    Faça um programa que receba
      • O código do produto comprado;
      • A quantidade comprada do produto
    Calcule e mostre:
      • O preço unitário do produto comprado, seguindo a Tabela I;
      • O preço total da nota;
      • O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
      • O preço final da nota depois do desconto.

    Desconto:
      Até R$ 250,00 5%
      Entre R250, 00eR 500,00 10%
      Acima de R$ 500,00 15%
   */

  static Float getProductPriceByCode (int productCode) {
    if (productCode < 1 ) return (float) 0;
    else if (productCode < 11) return (float) 10;
    else if (productCode < 21) return (float) 15;
    else if (productCode < 31) return (float) 20;
    else if (productCode < 41) return (float) 40;
    else return (float) 0;
  }

  static Integer getProductDiscount (float cost) {
    if (cost <= 250 ) return 5;
    else if (cost <= 500) return 10;
    else return 15;
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int codProduto,  qtdProduto;
    float subtotalNota, totalNota, precoProduto, desconto;

    System.out.println("Digite o codigo do produto:");
    codProduto = keyboard.nextInt();
    
    System.out.println("Digite a quantidade de produtos:");
    qtdProduto = keyboard.nextInt();

    precoProduto = getProductPriceByCode(codProduto);
    subtotalNota = precoProduto * qtdProduto;
    desconto = getProductDiscount(subtotalNota);
    totalNota = (100 - desconto) / 100 * subtotalNota;

    System.out.println("Preco do Produto: "+precoProduto);
    System.out.println("subtotal: "+subtotalNota);
    System.out.println("desconto: "+desconto+"%");
    System.out.println("total: "+totalNota);
  }
}