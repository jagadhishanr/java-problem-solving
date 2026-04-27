// Find the Largest Sum Contiguous Subarray (Kadane’s Algorithm)
// oExample:Input:[-2,1,-3,4,-1,2,1,-5,4]Output:6(Subarray:[4,
// -1,2,1])

public class ContiguousSubarray{
    public static int Contiguous (int []arr, int k){
        int n = arr.length;
        int window = 0;
        for(int i=0; i<k; i++){
            window += arr[i];
        }
        int max = window;
        for(int i=k; i<n; i++){
            window += arr[i];
            window -= arr[i-k];
            max = Math.max(max, window);
        }
        
        return max;
    }
    public static void main(String[]args){
int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
int k =4;
System.out.println(Contiguous(arr, k));
    }
}