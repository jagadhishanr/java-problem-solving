// Maximum consecutive one’s (or zeros) in a binary array
// Given a binary array arr[] consisting of only 0s and 1s, 
// find the length of the longest contiguous sequence of either 1s or 0s in the array.

// Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
// Output: 4
// Explanation: The maximum number of consecutive 1’s in the array is 4 from index 3-6.

// Input: arr[] = [0, 0, 1, 0, 1, 0]
// Output: 2
// Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.

// Input: arr[] = [0, 0, 0, 0]
// Output: 4
// Explanation: The maximum number of consecutive 0’s in the array is 4.

import java.util.*;
public class ContigousBinary{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arry size");
        int n = scan.nextInt();
        if(n!=0 || n!=1){
            System.out.println("Elements are must be in Binary");
        }
        int [] arr = new int[n]; 
         System.out.println("Enter array Binary Elemnts");
         for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
         }
         int currentCount = 1;
         int maxCount = 1;
         for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
                currentCount++;
            }
            else{
                currentCount =1;
            }
            maxCount = Math.max(maxCount, currentCount);
         }
         System.out.println("Contigous sequence of Binay elements are:" + " " + maxCount);


    }
}