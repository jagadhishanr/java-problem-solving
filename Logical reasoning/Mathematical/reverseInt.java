import java.util.*;
public class reverseInt{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int reverse = 0;
        while(n!=0){
            int temp = n%10; //get last digit
            reverse = reverse*10 + temp; //last digit stored in reverse with prev digit
            n = n/10; // remove the last digit
        }
        System.out.println(reverse);
    }
}