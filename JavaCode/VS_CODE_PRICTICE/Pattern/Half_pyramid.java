package Pattern;
/* print half pyramid star pattern like 
* 
* * 
* * * 
* * * * 
* * * * *
 */
public class Half_pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
