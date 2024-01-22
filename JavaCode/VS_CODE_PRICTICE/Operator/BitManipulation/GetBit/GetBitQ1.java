package JavaCode.VS_CODE_PRICTICE.Operator.BitManipulation.GetBit;

/* Question : Get the 3rd bit (position = 2) of an number n (n=0101) 
   Bit Mask = 1<<i
   Operation = AND (&) 
 */


public class GetBitQ1 {
    public static void main(String[] args) {
        
        int n=5;    // becouse 0101 -> 5 base of 10
        int pos=2;
        int bitMask=1<<pos;
        if ((bitMask&n)==0){
            System.out.println("Bit is Zero");
        }else{
            System.out.println("Bit is One");
        }
        
        
    }
    
}
