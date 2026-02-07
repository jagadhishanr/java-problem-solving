import java.util.*;
public class sumArray{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int arr = scan.nextInt();
        int array[] = new int[arr];
        int sum = 0;
        for(int i=0; i<arr; i++){
            array[i] = scan.nextInt();
        }
        for(int i =0; i<arr; i++){
            sum = sum+array[i];
        }
        System.out.println(sum);

    }
}