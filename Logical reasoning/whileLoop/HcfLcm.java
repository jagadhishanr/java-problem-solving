import java.util.*;
public class HcfLcm{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        int x = a;
        int y = b;
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        int hcf = x;

        int lcm = (a*b)/hcf;

        System.out.println("HCF=" + hcf);
        System.out.println("LCM=" + lcm);
    }
}