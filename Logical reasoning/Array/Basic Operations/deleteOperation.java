import java.util.*;
public class deleteOperation{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("deletion from begin");
        if(n>0){
            for(int i=0; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            n--;
        }
        else{
            System.out.println("Invalidn access to delete operation");
        }
        System.out.println("Deletion from end");
        if(n>0){
            n--;
        }
        else{
            System.out.println("Invalid array");
        }

        System.out.println("Enter array index");
        int index = scan.nextInt();
        if(index>=0 && index<n){
for(int i=index; i<n-1; i++){
    arr[i] = arr[i+1];
}
n--;
        }
        else{
            System.out.println("invalid index of array");
        }




        for(int i=0; i<n-1; i++){
System.out.println(arr[i]);
        }
        

    }
}