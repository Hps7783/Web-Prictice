package Conditional_Statement.if_else;

/* user inputs age and prints whether the person is adult or not if age>=18 else not adult */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter your Age");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("You are Adult");
            }else{
                System.out.println("You are not Adult");
            }
        }
    }
    
}
