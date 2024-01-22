package Input;

/* All Data type use in user input through scanner class  */

      // .next() is used to read the next word in the input stream
      // .nextLine() is used to read the next line in the input stream
      // .nextDouble() is used to read the next double in the input stream
      // .nextFloat() is used to read the next float in the input stream
      // .nextLong() is used to read the next long in the input stream
      // .nextInt() is used to read the next integer in the input stream
      // .nextBoolean() is used to read the next boolean in the input stream
      // .nextBigInteger() is used to read the next BigInteger in the input stream
      // .nextBigDecimal() is used to read the next BigDecimal in the input stream
      // .nextShort() is used to read the next short in the input stream
      // .nextByte() is used to read the next byte in the input stream
      // .nextChar() is used to read the next char in the input stream
      // .next().charAt(0) is used to read the next char in the input stream
      // .nextLine().charAt(0) is used to read the next char in the input stream
      // .next().charAt(0) is used to read the next char in the input stream

import java.math.BigInteger;
import java.util.Scanner;

public class Datatype_Input_Using_Scanner {

  public static void main(String[] args) {
    // System.out.println("Enter your Number : ");
    // Scanner sc = new Scanner(System.in);
    // int number = sc.nextInt();
    // System.out.println("Your Number : " + number);
    // System.out.println("Enter your Name : ");
    // String name = sc.next();
    // System.out.println(" Your Name : " + name);
    // System.out.println("Enter your Salary : ");
    // double salary = sc.nextDouble();
    // System.out.println(" Your Salary : " + salary);
    // System.out.println("Enter your Hight : ");
    // float height = sc.nextFloat();
    // System.out.println(" Your Hight : " + height);
    // System.out.println("Enter your Grade : ");
    // char grade = sc.next().charAt(0);
    // System.out.println(" Your Grade : " + grade);
    // sc.close();

    Scanner sc = new Scanner(System.in);{
    System.out.println("Enter your Name : ");
    String name = sc.nextLine();
    System.out.println("Enter your Number : ");
    int number = sc.nextInt();
    System.out.println("Enter your Mobile Number : ");
    BigInteger mobilenumber = sc.nextBigInteger();
    System.out.println("Enter your Salary : ");
    double salary = sc.nextDouble();
    System.out.println("Enter your Hight : ");
    float height = sc.nextFloat();
    System.out.println("Enter your Grade : ");
    char grade = sc.next().charAt(0);
   {
    System.out.println("Your Details are : ");
   }
    System.out.println("Your Name : " + name);
    System.out.println("Your Number : " + number);
    System.out.println("Your Mobile Number : " + mobilenumber);
    System.out.println("Your Salary : " + salary);
    System.out.println("Your Hight : " + height);
    System.out.println("Your Grade : " + grade);
    sc.close();
    }
    
  }
}
