import java.util.*;
public class multi{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number the multiplication table");
        int mul = scan.nextInt();
        System.out.println("Enter the end of" + " " + mul + " " + "multiplication table");
        int end = scan.nextInt();
        int table = 0;
        for(int i=0; i<= end; i++){
            table = i*mul;
            System.out.println(mul + "*" + i + "=" + table);
        }
    }
}