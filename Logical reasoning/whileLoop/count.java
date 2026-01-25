import java.util.Scanner;
public class count{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int typ = scan.nextInt();
int count = 0;
if(typ==0){
    count = 1;
}else{
    while(typ !=0){
        typ = typ/10;
count++;
    }
}
System.out.println(count);
    }
}