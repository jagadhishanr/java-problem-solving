import java.util.*;
public class revPrint{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int rev = scan.nextInt();
        for(int i=rev; i>=0; i--){
            System.out.print(i + " ");
        }
    }
}