package Conditional_Statement.Switch_Break;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Your Choice Button Are (1),(2),(3) only");
        System.out.println("Enter your Button Choice : ");
        try (Scanner sc = new Scanner(System.in)) {
            int Button = sc.nextInt();
            System.out.println("your choice is : " + Button);
            {
                switch (Button) {
                    case 1:
                        System.out.println("HELLO");
                        break;
                    case 2:
                        System.out.println("NAMASTE");
                        break;
                    case 3:
                        System.out.println("BONJOUR");
                        break;   
                
                    default:
                        System.out.println("INVILED");
                        break;
                }
            }
        }
        
    }
    
}
