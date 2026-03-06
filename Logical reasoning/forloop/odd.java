import java.util.*;
public class odd{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int odd = scan.nextInt();
        for(int i=1; i<=odd; i++){
            if(i%2 != 0){
                System.out.print(i  + " ");
            }
        }
    }
}