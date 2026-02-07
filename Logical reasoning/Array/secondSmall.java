import java.util.Scanner;
public class secondSmall{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
int arr[] = new int[num];
for(int i=0; i<arr.length; i++){
    arr[num] = scan.nextInt();
}
int small = arr[0];
for(int j=1; j<arr.length; j++){
if(arr[1] < small){
    small = arr[j];
}
}
int second =  Integer.MAX_VALUE;
for(int k=0; k<arr.length; k++){
    if(arr[k]!=small && arr[k]<second){
        second = arr[k];
    }
}
System.out.println(second);

    }
}