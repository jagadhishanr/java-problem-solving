import java.util.*;
public class selectionSort{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int enter = scan.nextInt();
int[] arr = new int[enter];
for(int i=0; i<enter; i++){
    arr[i] = scan.nextInt();
}

for(int i=0; i<enter-1; i++){
    int minIndex =i;
for(int j=i+1; j<enter; j++){
    if(arr[j]<arr[minIndex]){
    minIndex = j;
    }
}
int temp = arr[minIndex];
arr[minIndex] = arr[i];
arr[i] = temp;
}
for(int num:arr){
    System.out.print(num + " ");
}
    }
}