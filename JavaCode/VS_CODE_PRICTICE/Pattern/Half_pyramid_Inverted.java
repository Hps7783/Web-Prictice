package Pattern;
/* print half pyramid star pattern like  
* * * * * 
* * * *
* * *
* *
*
  */
public class Half_pyramid_Inverted {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
