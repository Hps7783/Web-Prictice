package JavaCode.VS_CODE_PRICTICE.Prictice_questions;
//Question1: How do you reverse string in java ?
/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        String str="hello";
        System.out.println(str);
        for (int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}