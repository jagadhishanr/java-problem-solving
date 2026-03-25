import java.util.*;
public class Average{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int enter = scan.nextInt();
        int arr[] = new int[enter];
        int sum = 0;

        for(int i=0; i<enter; i++){
arr[i] = scan.nextInt();
        }
        for(int i=0; i<enter; i++){
            sum = arr[i]+sum;
        }
        double Average = sum/arr.length;
        System.out.println("the average of array elements is :" + " " + Average);

    }
}