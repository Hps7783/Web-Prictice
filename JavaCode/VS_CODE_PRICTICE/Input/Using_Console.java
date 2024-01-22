package Input;

import java.math.BigInteger;

public class Using_Console {
    public static void main(String[] args) {

        // input character
        System.out.println("enter your name : ");
        String name=System.console().readLine();
        System.out.println("Your name is : >> "+name);

        // input integer
         System.out.println("enter your number : ");
         int number=Integer.parseInt(System.console().readLine());
         System.out.println("Your number is : >> "+number);

        // input more number more then 10 digit
        System.out.println("enter your mobile number : ");
        BigInteger mobilenumber=new BigInteger(System.console().readLine());
        System.out.println("Your mobile number is : >> "+mobilenumber);
        
        
        // input double number
        System.out.println("enter your salary : ");
        double salary=Double.parseDouble(System.console().readLine());
        System.out.println("Your salary is : >> "+salary);

        // input float number
        System.out.println("enter your hight : ");
        float height=Float.parseFloat(System.console().readLine());
        System.out.println("Your hight is : >> "+height);
        
        // input char
        System.out.println("enter your grade : ");
        char grade=System.console().readLine().charAt(0);
        System.out.println("Your grade is : >> "+grade);

    }
}
