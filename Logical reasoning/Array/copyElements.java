import java.util.*;
public class copyElements{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ARRAY Size");
        int enter = scan.nextInt();
        int arr1[] = new int[enter];
        int arr2[] = new int[enter];
        System.out.println("Enter the ARRAY Elements");
        for(int i=0; i<enter; i++){
            arr1[i] = scan.nextInt();
        }
        for(int i=0; i<enter; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("The copied elements are: ");
        for(int i=0; i<enter; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}