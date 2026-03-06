import java.util.*;
public class evenSum{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int even = scan.nextInt();
int sum = 0;
for(int i=0; i<= even; i++){
    if(i%2==0){
        sum = sum+i;
        System.out.print(sum + " ");
    }
}
    }
}