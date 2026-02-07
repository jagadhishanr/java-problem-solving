import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = scan.nextInt();

        int digits = 0;
        int sum = 0;
        int temp = original;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        
        temp = original;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        scan.close();
    }
}
