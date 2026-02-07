import java.util.Scanner;
public class moveZeros{
    public static void main(String[] args){
Scanner scan =  new Scanner(System.in);
int enter = scan.nextInt();
int arr[] = new int[enter];
for(int i=0; i<arr.length;i++){
    arr[i] = scan.nextInt();
}
int index = 0;
for(int i=0; i<arr.length;i++){
    if(arr[i]!=0){
        arr[index] = arr[i];
        index++;
    }
}
while(index > arr.length){
    arr[index] = 0;
    index++;
}
System.out.println("the moved zeros elements are");
for(int i=0; i<arr.length; i++){
    System.out.println(arr[i] + " ");
}
    }
}