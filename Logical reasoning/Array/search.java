import java.util.*;
public class search{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int array = scan.nextInt();
        int arr[] = new int[array];
        for(int i=0; i<array;i++){
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        boolean isPreasent = false;
        for(int i=0; i<array; i++){
            if(arr[i]==target){
                System.out.println("the element of" + target + "is present");
                isPreasent = true;
                break;
            }
        }
        if(!isPreasent){
            System.out.println("the element of " + target + " is not present");
        }

    }
}