package Conditional_Statement.if_else;

/* user input number odd or even  */

import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }
        }
    }
}