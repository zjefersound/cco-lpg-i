class Contador {
  private int valorAtual;

  public Contador() {
    this.valorAtual = 0;
  }

  public void atribuirValor(int valor) {
    this.valorAtual = valor;
  }

  public int obterValor() {
    return this.valorAtual;
  }

  public void incrementarValor() {
    this.valorAtual++;
  }

  public void zerarValor() {
    this.valorAtual = 0;
  }

}
