import java.util.*;
public class printNum{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0; i<=num; i++){
            System.out.print(i + " ");
        }
    }
}