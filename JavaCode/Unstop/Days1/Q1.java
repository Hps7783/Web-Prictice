package JavaCode.Unstop.Days1;



/*The first line contains an integer n, size of the array.

The second line contains n space separated integers representing the array arr[i].

The last line contains an integer d, denoting the number of days.

Output Format
Print a single integer mindifficulty– the minimum difficulty simon faces to schedule all tasks.

 

Constraints
1 <= n <= 300.

0<= arr[i] <= 1000.

1<= d<=10

Sample Testcase 0
Testcase Input
3
9 9 9
4
Testcase Output
-1 */

// import java.util.Scanner;

// public class Q1 {

//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             int n = scanner.nextInt();
//             int[] arr = new int[n];
            
//             for(int i = 0; i < n; i++) {
//                 arr[i] = scanner.nextInt(); 
//             }
            
//             int d = scanner.nextInt();
            
//             int mindifficulty = getMinDifficulty(arr, d);
            
//             System.out.println(mindifficulty+1);
//         }
//     }
    
//     public static int getMinDifficulty(int[] arr, int d) {
//         int maxTaskPerDay = 0;
//         for(int task : arr) {
//             maxTaskPerDay = Math.max(maxTaskPerDay, task); 
//         }
        
//         if(maxTaskPerDay * d < arr.length) {
//             return -1;
//         }
        
//         return maxTaskPerDay;
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// public class Q1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of the array
//         int n = scanner.nextInt();

//         // Input array elements
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Input number of days
//         int d = scanner.nextInt();

//         // Calculate minimum difficulty
//         int result = calculateMinimumDifficulty(arr, n, d);

//         // Output the result
//         System.out.println(result);

//         scanner.close();
//     }

//     // Function to calculate the minimum difficulty
//     private static int calculateMinimumDifficulty(int[] arr, int n, int d) {
//         // Sort the array in ascending order
//         Arrays.sort(arr);

//         // Check if it's possible to schedule all tasks within the given number of days
//         if (d >= n - 1) {
//             return -1; // It's possible, so return -1
//         }

//         // Calculate the minimum difficulty
//         int minDifficulty = Integer.MAX_VALUE;
//         for (int i = 0; i + d < n; i++) {
//             int currentDifficulty = arr[i + d] - arr[i];
//             minDifficulty = Math.min(minDifficulty, currentDifficulty);
//         }

//         return minDifficulty;
//     }
// }

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        int n = scanner.nextInt();

        // Input: Array representing the difficulty of tasks
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input: Number of days
        int d = scanner.nextInt();

        // Output: Minimum difficulty
        int minDifficulty = getMinimumDifficulty(arr, n, d);
        System.out.println(minDifficulty);

        scanner.close();
    }

    private static int getMinimumDifficulty(int[] arr, int n, int d) {
        // Sorting the array in descending order to minimize the difficulty
        Arrays.sort(arr);

        // Checking if it's possible to schedule tasks within the given days
        if (n <= d) {
            return -1; // Not possible to schedule all tasks in given days
        }

        // Calculating the minimum difficulty
        int minDifficulty = Integer.MAX_VALUE;
        for (int i = 0; i <= n - d; i++) {
            int difficulty = arr[i + d - 1] - arr[i];
            minDifficulty = Math.min(minDifficulty, difficulty);
        }

        return minDifficulty;
    }
}
