import java.util.*;
public class sumNumbers{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int sum = 0;
int temp = Math.abs(n); //handles negative numbers
while(temp > 0){
    sum += temp%10; // get the last digit and store it in sum
    temp /= 10; // removes the last digit
}
System.out.println(sum);
    }
}
