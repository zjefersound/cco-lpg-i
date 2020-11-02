public class ex_01 {
  /**
   * Comprimento = 2пr
   * Area = 4.п.r**2
   * Volume = 4.п.r**3/3
   */
  public static void main(String[] args) {
    double pi = 3.14;
    double raio = 2;
    double area, volume, comprimento;

    comprimento = 2 * raio * pi;
    area = 4 * pi * Math.pow(raio, 2);
    volume = 4 * pi * Math.pow(raio, 3) / 3;

    System.out.println("c:"+comprimento+" a:"+area+" v:"+volume);
  }
}
