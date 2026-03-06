import java.util.*;
public class swapNoTemp{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
b = b+a;
a = b-a;
b = b-a;
System.out.println("a=" + a + " " + "b=" + b);
    }
}