import java.util.*;
public class thirdLargest{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
if(n<3){
    System.out.println("Elements must be in greater then 3 numbers");
}
int arr[] = new int[n];
System.out.println("Enter array elements");
for(int i=0; i<n; i++){
    arr[i] = scan.nextInt();
}
int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;
int third = Integer.MIN_VALUE;
for(int i=0; i<n; i++){
    if(arr[i]>first){
        third = second;
        second = first;
        first = arr[i];
    }
    else if(arr[i]>second){
        third = second;
        second = arr[i];
    }
    else if(arr[i]>third){
        third = arr[i];
    }
}
System.out.println("Third largest element is +" + third);
    }
}