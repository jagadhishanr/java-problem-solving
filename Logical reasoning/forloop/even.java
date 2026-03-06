import java.util.*;
public class even{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int even = scan.nextInt();
        for(int i =2; i<=even; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}