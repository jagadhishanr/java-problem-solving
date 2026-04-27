// import java.util.*;
// public class Rotation{
//     public static void leftRotation(int [] arr, int k){
//         int n= arr.length;
//         k = k%n;
//         int [] temp = new int[n];
//         for(int i=0; i<n-k; i++){
//             temp[i] = arr[i+k];
//         }
//         for(int i=0; i<k; i++){
//             temp[n-k+i] = arr[i];
//         }
//         System.out.println("Left Rotation");
//         printArray(temp);

//     }
//     public static void rightRotation(int[]arr,int k){
//         int n = arr.length;
//         k=k%n;
//         int [] arr = new int[n];
//         for(int i=0; i<k; i++){
//             temp[n-k+i] = arr[i];
//         }
//         for(int i=k; i<n-k; i++){
//             temp[k+i] = arr[i];
//         }
//         System.out.println("Right Rotation");
//         printArray(temp);
//     }
//     public static void printArray(int []arr){
//         for(int num: arr){
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter array size");
//         int n = scan.nextInt();
//         int [] arr = new int[n];
//         System.out.println("Enter Array Elements");
//         for(int i=0; i<n; i++){
//             arr[i] = scan.nextInt();
//         }
//         System.out.println("Enter the number of k Rotation");
//         int k = scan.nextInt();
//         leftRotation(arr, k);
//         rightRotation(arr, k);
//     }

// }
import java.util.*;
public class Rotation{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = scan.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter Array Elements");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        printFrequency(arr);
        printOddEven(arr);
    }
    public static void printFrequency(int [] arr){
        HashMap<Integer, Integer>map = new HashMap<>();
        int maxCOUNT =0;
        int maxFrquency = arr[0];
        for(int num:arr){
            int count = map.getOrDefault(num, 0) +1;
            map.put(num , count);
           if(count > maxCOUNT){
            maxCOUNT = count;
            maxFrquency = num;
           }
        }
        System.out.println("The most frequent element is :" + maxCOUNT);
    }
    public static void printOddEven(int [] arr){
        for(int num : arr){
            if(num > 0){
            for(int i=0; i<num; i++){
            System.out.println(num + " ");
            }
            }

        }
    }
}