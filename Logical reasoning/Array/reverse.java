import java.util.Scanner;
public class reverse{
    public static void main(String [] args){
Scanner scan = new Scanner(System.in);
int enter = scan.nextInt();
int num[] = new int[enter];

for(int i=0; i<num.length; i++){
    num[i] = scan.nextInt();
}
int start = 0;
int end = num.length-1;
while(start < end){
    int temp = num[start];
    num[start] = num[end];
    num[end] = temp;
    start++;
end--;
}   
for(int j=0;j<num.length;j++){
    System.out.println(num[j] + " ");
}
}
}