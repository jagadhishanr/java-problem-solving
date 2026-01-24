import java.util.Scanner;
public class evenSum{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=inp){

            if(i%2==0){
                sum = sum+=i;
            }
            i++;
        }
        System.out.println(sum);
        scan.close();

    }
}