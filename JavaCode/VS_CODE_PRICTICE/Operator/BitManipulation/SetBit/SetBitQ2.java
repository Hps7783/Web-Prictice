package JavaCode.VS_CODE_PRICTICE.Operator.BitManipulation.SetBit;

/*Question : Set the 3rd bit (position = 2) of an number n (n=0101)
 * Bit Mask = 1<<i
 * Operation = OR (|)
 * 
 */


public class SetBitQ2 {
    public static void main(String[] args) {
        int n=5;    // becouse 0101 -> 5 base of 10
        int pos=3;
        int bitMask=1<<pos;
        int newBitMask=bitMask|n;
        System.out.println(newBitMask);
        
    }
    
}
