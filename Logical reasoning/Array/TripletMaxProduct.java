// Maximum product of a triplet (subsequence of size 3) in array
// Given an integer array, find a maximum product of a triplet in the array.

// Examples: 

// Input:  arr[ ] = [10, 3, 5, 6, 20]
// Output: 1200
// Explanation: Multiplication of 10, 6 and 20

// Input:  arr[ ] =  [-10, -3, -5, -6, -20]
// Output: -90

// Input: arr[ ] =  [1, -4, 3, -6, 7, 0]
// Output: 168

import java.util.*;
public class TripletMaxProduct{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 3){
            System.out.println("Elements length must have beem atleast 3 characters");
        }
        int[]arr = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int max1 = arr[n-1] * arr[n-2] * arr[n-3];
        int max2 = arr[0] * arr[1] * arr[2];
        int result = Math.max(max1, max2);
        System.out.println("Result is: " + " " + result);
    }
}