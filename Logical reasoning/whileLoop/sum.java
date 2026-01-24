import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int jaga = scan.nextInt();
        int i=1;
        int sum =0;
        while(i<=jaga){
            sum = sum+=i;
             i++;
        }
        System.out.println(sum);
       
    }
}