import java.util.Scanner;
public class palindromeNo{
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int typ = scan.nextInt();
int original = typ;
int rev = 0;
while(typ!=0){
    int digit = typ%10;
    rev = rev*10+digit;
    typ = typ/10;
}
if(rev==original){
    System.out.println("its palindrome");
}
else{
    System.out.println("not a palindrome");
}
    }
}