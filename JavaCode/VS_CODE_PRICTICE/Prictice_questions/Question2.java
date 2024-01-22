package JavaCode.VS_CODE_PRICTICE.Prictice_questions;
// Question2: How do you swap two numbers without using third variable?
public class Question2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swaping "+"a is : "+a +" and "+"b is :"+b);
        /* Method 1 */
        // a=a+b;
        // b=a-b;
        // a=a-b;

        /* Method 2 */
        a=b;
        b=a;
        System.out.println("after Swaping"+"a is : "+a +" and "+"b is :"+b);
    }
}
