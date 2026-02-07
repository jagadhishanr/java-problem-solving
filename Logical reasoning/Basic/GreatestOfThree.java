import java.util.Scanner;
public class GreatestOfThree{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int enter1 = scan.nextInt();

        System.out.println("Enter the second number");
        int enter2 = scan.nextInt();

        System.out.println("Enter the third number");
        int enter3 = scan.nextInt();

        if(enter1>=enter2 && enter1>=enter3){
            System.out.println("First number is greatest");
        }
        else if(enter2>=enter1 && enter2>=enter3){
            System.out.println("Second number is greatest");
        }
        else{
            System.out.println("Third  number is greatest");
        }

    }
}