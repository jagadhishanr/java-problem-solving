import java.util.*;
public class unique{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int enter  = scan.nextInt();
        int [] arr = new int[enter];
        for(int i=0; i<enter; i++){
            arr[i] = scan.nextInt();
        }
        Set <Integer> seen = new HashSet<>();
        Set <Integer> Duplicate = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                Duplicate.add(num);
            }
        }

        for(int num : seen){
            if(!Duplicate.contains(num)){
                System.out.print(num + " ");
            }
        }
        scan.close();
    }
}