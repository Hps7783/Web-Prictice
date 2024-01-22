package JavaCode.VS_CODE_PRICTICE.Operator.BitManipulation.ClearBit;

// clear the 3rd bit (position=2) of number n (n=0101)
// Bit Mask = 1<<i  
// Operation = AND (&) with NOT (~)


public class ClearBitQ1 {
    public static void main(String[] args) {
        int n=5;    // becouse 0101 -> 5 base of 10
        int pos=2;
        int bitMask=1<<pos;
        int notBitMask=~bitMask;

        int newBitMask=notBitMask&n;
        System.out.println(newBitMask);
        
    }
    
}
