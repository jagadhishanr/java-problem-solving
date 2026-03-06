import java.util.*;
public class removeDuplicates{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        HashSet<Integer>set = new HashSet<>();
        for(int num : arr){
set.add(num);
        }
        for(int num:set){
            System.out.println("Removed elements are" + num);
        }
    }
}