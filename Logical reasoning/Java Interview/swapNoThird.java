import java.util.Scanner;
public class swapNoThird{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scan.nextInt();
         System.out.println("Enter b");
        int b = scan.nextInt();
        b = b+a;
        a = b-a;
        b = b-a;
        System.out.println("After Swapping A ="  + a + " and B=" +  b);
    }
}