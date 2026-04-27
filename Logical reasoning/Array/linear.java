import java.util.*;
public class linear{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int enter = scan.nextInt();
        int [] arr = new int[enter];
        for(int i=0; i< enter; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter target Element");
        int target = scan.nextInt();
        int foundIndex = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                foundIndex = i;
                break;
            }
        }
        if(foundIndex != -1){
            System.out.println("you searched element is" + " " + foundIndex);
        }
        else{
            System.out.println("Element not found");
        }
    }
}