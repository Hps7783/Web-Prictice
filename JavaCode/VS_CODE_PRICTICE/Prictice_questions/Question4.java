package JavaCode.VS_CODE_PRICTICE.Prictice_questions;
// Question4: How do you check if given number is prime number?
public class Question4 {
    public static void main(String[] args) {
        int num=11;
        boolean flag=true;
        for (int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        
    }
}
