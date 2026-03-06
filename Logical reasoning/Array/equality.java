import java.util.*;
public class equality{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int arr2[] = new int[n2];
        for(int j=0; j<n2;j++){
            arr2[j] = scan.nextInt();
        }
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Both arrays are not equal");
        }
    }
}