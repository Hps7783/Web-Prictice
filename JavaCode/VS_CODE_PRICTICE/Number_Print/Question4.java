package Number_Print;
/*
 *>>>>>>> Print sum of all odd number between 10 to 100 and
 * which are grater then 50
 */

public class Question4 {
    
    public static void main(String[] args) {
        int sum=0;
        for(int i=10;i<=100;i++){
            if(i%2!=0){
                if(i>50){
                    sum = sum+i;
                    System.out.println(sum);
                }
                // System.out.println(i);
            }
        }
    }
    
}
