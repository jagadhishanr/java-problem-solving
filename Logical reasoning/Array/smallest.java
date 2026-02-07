import java.util.Scanner;
public class smallest{
 public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int enter = scan.nextInt();
int small[] = new int[enter];
for(int i=0; i<small.length;i++){
    small[i] = scan.nextInt();
}
int min = small[0];
for(int j=1;j<small.length;j++){
    if(small[j]<min){
        min = small[j];
    }
}
System.out.println("Smallest element is: " + min);
 }
}