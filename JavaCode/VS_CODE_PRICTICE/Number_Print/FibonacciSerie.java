package Number_Print;

/* print fibonacci series print up to 10 number */

public class FibonacciSerie {

  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.println(a + " " + b);
    for (int i = 0; i < 10; i++) {
      int c = a + b;
      System.out.println(c);
      a = b;
      b = c;
    }
  }
}
