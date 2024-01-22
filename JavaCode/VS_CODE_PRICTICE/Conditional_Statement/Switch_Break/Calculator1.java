package Conditional_Statement.Switch_Break;

import java.util.Scanner;

public class Calculator1 {

  public static void main(String[] args) {
    System.out.println("............CALCULATOR................");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Modulus");
    System.out.println("6. Exit");
    System.out.println("Enter your choice : ");
    int choice = 0;
    try (Scanner sc = new Scanner(System.in)) {
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter your first number : ");
          int num1 = sc.nextInt();
          System.out.println("Enter your second number : ");
          int num2 = sc.nextInt();
          System.out.println("Addition is : " + (num1 + num2));
          break;
        case 2:
          System.out.println("Enter your first number : ");
          int num3 = sc.nextInt();
          System.out.println("Enter your second number : ");
          int num4 = sc.nextInt();
          System.out.println("Subtraction is : " + (num3 - num4));
          break;
        case 3:
          System.out.println("Enter your first number : ");
          int num5 = sc.nextInt();
          System.out.println("Enter your second number : ");
          int num6 = sc.nextInt();
          System.out.println("Multiplication is : " + (num5 * num6));
          break;
        case 4:
          System.out.println("Enter your first number : ");
          int num7 = sc.nextInt();
          System.out.println("Enter your second number : ");
          int num8 = sc.nextInt();
          System.out.println("Division is : " + (num7 / num8));
          break;
        case 5:
          System.out.println("Enter your first number : ");
          int num9 = sc.nextInt();
          System.out.println("Enter your second number : ");
          int num10 = sc.nextInt();
          System.out.println("Modulus is : " + (num9 % num10));
          break;
        case 6:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid Choice");
          break;
      }
      System.out.println("Thanks for using my calculator");
    }
  }
}
