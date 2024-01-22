package Pattern;

import java.util.Scanner;

/* print Hollow Rectangle like   
* * * * * *
*         *
*         *
*         *
* * * * * *
*/
public class Hollow_Rectangle {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.err.println("Enter row number n : ");
      int n = sc.nextInt();
      System.err.println("Enter column number m : ");
      int m = sc.nextInt();
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
          if (i == 1 || j == 1 || i == n || j == m) { // for cell i (i,j)
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
          
        }
        System.out.println();
      }
    }
  }
}
