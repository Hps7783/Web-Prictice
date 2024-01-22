package Pattern;

import java.util.Scanner;

/*
 * print solid ractangle 4*5  * * * * *
 *                            * * * * *
 *                            * * * * *
 *                            * * * * *
 * 
 */

public class Solid_ractangle {
    public static void main(String[] args) {
        System.out.println("Enter row number n : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Enter column number m : ");
            int m = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j=1;j<=m;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    
}
