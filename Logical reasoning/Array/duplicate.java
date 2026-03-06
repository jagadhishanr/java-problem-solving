import java.util.*;
public class duplicate{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i< arr.length;i++){
            arr[i] = scan.nextInt();
        }
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>duplicate = new HashSet<>();
        for(int i=0; i< arr.length;i++){
            if(!set.add(arr[i])){
                duplicate.add(arr[i]);
            }
        }
        if(duplicate.isEmpty()){
            System.out.println("no duplicate elements is found");
        }else{
            System.out.println("the duplicate elements are");
            for(int num:duplicate){
                System.out.println(num);
            }
        }

    }
}