import java.util.*;
public class ReverseGroup{
    public static void reverseIn(int []arr, int n, int k){
        for(int i=0; i<n; i+=k){
            int left =i;
            int right = Math.min(i+k-1,n-1);
            while(left<right){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter array size");
            int n = scan.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter array elements");
            for(int i=0; i<n; i++){
arr[i] = scan.nextInt();
            }
            System.out.println("Enter k");
            int k = scan.nextInt();
            reverseIn(arr,n,k);
            System.out.println("Reversed group of elements in array is");
            for(int num:arr){
                System.out.println(num);
            }
        }
    }
