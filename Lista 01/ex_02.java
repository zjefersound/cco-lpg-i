public class ex_02 {
  /**
   * ax*x + bx + c
   * Delta = b**2 -4 * a * c
   * (-b +- sqrt(Delta))/2a
   */
  public static void main(String[] args) {
    int a, b, c;
    double delta, x1, x2;

    a=1;
    b=12;
    c=-13;

    delta = Math.pow(b,2) -4 * a * c;

    x1 = (-b + Math.sqrt(delta)) / 2 * a;
    x2 = (-b - Math.sqrt(delta)) / 2 * a;

    System.out.println("x1:"+x1+" x2:"+x2);
  }
}
