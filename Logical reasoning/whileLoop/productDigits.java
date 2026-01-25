import java.util.Scanner;
public class productDigits{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int typ = scan.nextInt();
int i =0;
int pro =0;
while(i<=typ){
    pro = pro*=i;
    i++;
}
System.out.println(pro);
    }
}