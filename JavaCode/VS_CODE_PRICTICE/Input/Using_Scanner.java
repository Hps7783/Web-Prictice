package Input;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/* user input through scanner class */

public class Using_Scanner {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      /* .next() is used to read the next word in the input stream */

      System.out.println("Enter your Name : ");
      String name = sc.next();
      System.out.println(name);

      /* .nextLine() is used to read the next line in the input stream */

      System.out.println("Enter your Name : ");
      String f_name = sc.nextLine();
      System.out.println(f_name);

      /* .nextDouble() is used to read the next double in the input stream */

      System.out.println("Enter double Number : ");
      double double_Number = sc.nextDouble();
      System.out.println(double_Number);

      /* .nextFloat() is used to read the next float in the input stream */

      System.out.println("Enter float Number : ");
      float float_Number = sc.nextFloat();
      System.out.println(float_Number);

      /* .nextLong() is used to read the next long in the input stream */

      System.out.println("Enter long Number : ");
      long long_Number = sc.nextLong();
      System.out.println(long_Number);

      // .nextInt() is used to read the next integer in the input stream

      System.out.println("Enter int Number : ");
      int int_Number = sc.nextInt();
      System.out.println(int_Number);

      // .nextBoolean() is used to read the next boolean in the input stream

      System.out.print("Enter true or false: ");
      boolean input = sc.nextBoolean();
      System.out.println("You entered: " + input);

      // .nextBigInteger() is used to read the next BigInteger in the input stream

      System.out.println("Enter BigInteger Number : ");
      BigInteger bigInteger_Number = sc.nextBigInteger();
      System.out.println(bigInteger_Number);

      // .nextBigDecimal() is used to read the next BigDecimal in the input stream

      System.out.println("Enter BigDecimal Number : ");
      BigDecimal bigDecimal_Number = sc.nextBigDecimal();
      System.out.println(bigDecimal_Number);

      // .nextShort() is used to read the next short in the input stream

      System.out.println("Enter short Number : ");
      short short_Number = sc.nextShort();
      System.out.println(short_Number);

      // .nextByte() is used to read the next byte in the input stream

      System.out.println("Enter byte Number : ");
      byte byte_Number = sc.nextByte();
      System.out.println(byte_Number);

      // .next().charAt(0) is used to read the next char in the input stream

      System.out.println("Enter your Full Name : ");
      char Full_Name = sc.next().charAt(0);
      System.out.println(Full_Name);

      // .nextLine().charAt(0) is used to read the next char in the input stream

      System.out.println("Enter your Full Name : ");
      char Name = sc.next().charAt(6);
      System.out.println(Name);

      // .next().charAt(0) is used to read the next char in the input stream

      System.out.println("Enter your Full Name : ");
      char Names = sc.next().charAt(6);
      System.out.println(Names);
    }
  }
}
