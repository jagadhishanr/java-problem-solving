import java.util.*;
public class prime{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        System.out.println("Prime number is ");
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j <=i/2; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
            System.out.print(i + " ");
        }
        }

    }
}