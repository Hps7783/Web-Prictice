package JavaCode.VS_CODE_PRICTICE.Sorting;

//bubble sort

public class Bubbel_SortingQ1 { 
    public static void main(String[] args) {
        int num[]={7,8,3,1,2};
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        printArray(num);
    }

    private static void printArray(int[] num) {
    }
}
