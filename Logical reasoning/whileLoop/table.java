import java.util.Scanner;
public class table{
    public static void main(String [] args){
Scanner scan = new Scanner(System.in);
int jaga = scan.nextInt();
int i =1;
while(i<=jaga){
    System.out.println(jaga  + "*" + i + "=" + i*jaga);
    i++;
}
    }
}