package JavaCode.VS_CODE_PRICTICE.Operator.BitManipulation.UpdateBit;

import java.util.Scanner;

/* Question : Update the 2nd bit (position = 1) of an number n (n=0101)
 * for 0
 * Bit Mask = 1<<i
 * Operation = AND (&) with not(~)

 For 1 
 * Bit Mask = 1<<i
 * Operation = OR (|)

*/

public class UpdateBitQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Oper=sc.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(Oper==1){
            int newNumber=bitMask|n;
            System.out.println(newNumber);
        }else{
            int newBitMask=~(bitMask);
            int newNumber=newBitMask&n;
            System.out.println(newNumber);
        }
    }
    
}
