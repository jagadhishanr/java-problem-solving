import java.util.Scanner;
public class productAll{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        int product = 1;
        if(user==0){
            product = 0;
        }
        while(user!=0){
            int digit = user%10;
            product = product*digit;
            user = user/10;
        }
        System.out.println(product);
    }
}