import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int typ = scan.nextInt();
int rev =0;
while(typ!=0){
    int digit = typ%10;
    rev = rev*10+digit;
    typ = typ/10;

}
System.out.println(rev);
    }
}