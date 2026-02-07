import java.util.Scanner;
public class RotateKElement{
    static void reverse(int[]arr, int start, int end){
        while(start < end){
int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }
    static void rightRotate(int[]arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    static void leftRotate(int[]arr, int k){
        int n = arr.length;
        k = k%n;
        rightRotate(arr, n-k);
    }

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array size");
     int n = scan.nextInt();
    int[] arr = new int[n];
     System.out.println("Enter array elements");
    for(int i=0; i<arr.length; i++){
        arr[i] = scan.nextInt();
    }
 System.out.println("Enter K position");
int k = scan.nextInt();
 System.out.println("Enter L/R");
 char en = scan.next().charAt(0);
 if(en == 'L' || en== 'l'){
    leftRotate(arr, k);
 }
 else if(en == 'R' || en == 'r'){
    rightRotate(arr, k);
 }
 else{
    System.out.println("Invalid choice");
    return;
 }
 for(int num: arr){
    System.out.println(num);
 }
}
}