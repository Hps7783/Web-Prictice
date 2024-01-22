package Number_Print;
/*Question No 5. 
v* >>>>>>>>> print digit X = 568954
 * 
 */


public class Queston5 {
    public static void main(String[] args) {
        int x = 568954;
        int count=0;
        while(x!=0){
            count ++;
            x=x/10;
            System.out.println(count);
        }
    }
    
}
