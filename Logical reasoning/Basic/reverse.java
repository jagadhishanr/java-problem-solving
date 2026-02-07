import java.util.Scanner;
public class reverse{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int enter = scan.nextInt();
        int reverse = 0;
        while(enter!=0){
            int digit = enter%10;
            reverse = reverse * 10 + digit;
            enter = enter/10;
        }
System.out.println("Reverse number is:" + reverse);
    }
}