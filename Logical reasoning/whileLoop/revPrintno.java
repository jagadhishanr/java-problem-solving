import java.util.Scanner;
public class revPrintno{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int jagan = scan.nextInt();
        int i = jagan;
        while(i>=0){
            System.out.println(i);
            i--;
        }
    }
    }