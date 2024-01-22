package Pattern;
/* Solid rhombus star pattern like below:

    * * * * * 
   * * * * * 
  * * * * * 
 * * * * * 
* * * * *  
  
 
 */
public class Solid_Rhombus {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            int space=n-i;
            for (int j=1;j<=space;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}