import java.util.Scanner;
public class largest{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int enter = scan.nextInt();
int arr[] = new int[enter];
for(int i=0; i<enter; i++){
    arr[i] = scan.nextInt();
}
int max = arr[0];
for(int j=1; j<arr.length;j++){
    if(arr[j]>max){
        max = arr[j];
    }
}
int secondLarge = Integer.MIN_VALUE;
for(int k=0;k<arr.length;k++){
    if(arr[k] != max && arr[k]>secondLarge){
secondLarge = arr[k];
    }
}
System.out.println(secondLarge);
    }
}