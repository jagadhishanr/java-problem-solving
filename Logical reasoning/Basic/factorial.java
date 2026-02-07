// Java Program to Find Factorial (Using Loop)

import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number let check its factorial");
        int enter = scan.nextInt();
        long facto = 1;
        for(int i=1; i<=enter; i++)
        {
            facto=facto*i;
        }
        System.out.println("Solution is :" + facto);

    }

}