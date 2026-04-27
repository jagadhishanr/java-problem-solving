public class slidingWindow{
    public static int maxSubArray(int []arr , int k){
        int n =arr.length;
    int window = 0;
    for(int i=0; i<k; i++){
        window += arr[i];
    }
    int maxSum = window;
    for(int i=k; i< n; i++){
     window += arr[i];
     window -= arr[i-k];
      maxSum = Math.max(maxSum,window);
    }
   return maxSum;
    }
    
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println(maxSubArray(arr,k));
        
        
     }
}