import java.util.*;
public class oddSum{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int odd = scan.nextInt();
        int sum = 0;
        for(int i=0; i<=odd; i++){
            if(i%2 != 0){
                sum = sum+i;
                System.out.print(sum + " ");
            }
        }

    }
}