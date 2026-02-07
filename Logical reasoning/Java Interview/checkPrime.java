import java.util.Scanner;
public class checkPrime{
    public static void main(String[]args){
        Scanner scan  = new Scanner(System.in);
        int enter = scan.nextInt();
        boolean isPrime = true;
        if(enter<=1){
            isPrime = false;
        }else{
            for(int i = 2; i <= enter/2; i++){
                if(enter%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime number is present");
        }else{
            System.out.println("Prime number is not present");
        }
    }
}