import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int fact = scan.nextInt();
int i = 1;
int facto = 1;
while(i<=fact){
    facto = facto*=i;
    i++;
}
System.out.println(facto);

    }
}