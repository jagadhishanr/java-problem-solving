import java.util.*;
public class countEvenOdd{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int enter = scan.nextInt();
        int arr[] = new int[enter];
        System.out.println("Enter the array elements");
        for(int i=0; i< enter; i++){
            arr[i] = scan.nextInt();
        }
int even = 0;
int odd = 0;
for(int i=0; i< enter; i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
            }  
        System.out.println("Even" + " " + even);
        System.out.println("Odd" + " " + odd);
    }
}