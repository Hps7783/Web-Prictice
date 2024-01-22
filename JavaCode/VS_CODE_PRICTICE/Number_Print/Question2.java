
package Number_Print;
/*Question 2.
 * >>>>> Print all odd Number between 10 to 100
 */

public class Question2 {
    public static void main(String[] args) {
        System.out.println("your odd number are :");
        for (int i = 10; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

}
