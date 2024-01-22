package JavaCode.VS_CODE_PRICTICE.Prictice_questions;
// Question3: How do you check if a vovel are persent in string?
public class Question3 {
    public static void main(String[] args) {
        String str="hello";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println(c+" is a vowel");
            }
        }
        
    }
}
