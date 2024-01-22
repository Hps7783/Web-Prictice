package Conditional_Statement.else_if;

/* user input a and b and print a is greater than b or lesser than b or equal to b */

import java.util.Scanner;

public class Question1 {

  public static void main(String[] args) {
    System.out.println("Enter your number of a : ");
    try (Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      System.out.println("Enter your number of b : ");
      int b = sc.nextInt();
      if (a == b) {
        System.out.println("a and b are equal");
      } else {
        if (a < b) {
          System.out.println("a is lesser than b");
        } else {
          System.out.println("a is greater than b");
        }
      }
    }
  }
}
