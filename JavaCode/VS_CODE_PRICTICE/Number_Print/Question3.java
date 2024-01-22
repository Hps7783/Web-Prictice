package Number_Print;

/*Question 3. 
 * >>>>>>> Print all odd number between 10 to 100 and
 * which one grater then 50
 * 
 */

public class Question3 {
    public static void main(String[] args) {
        for(int i=10;i<=100;i++){
            if(i%2!=0){
                if(i>50){
                    System.out.println(i);
                }
            }
        }
    }
    
}
