import java.util.*;
public class insertOperation{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size" + " ");
        int size = scan.nextInt();
        int [] arr = new int[100];
        System.out.println("Enter array elements");
        for(int i=0; i<=size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter Element do you want insert at begin");
        int beg = scan.nextInt();
        for(int i=size; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = beg;
        size++;

        System.out.println("Enter Element do you want insert at END");
        int end = scan.nextInt();
        arr[size] = end;
        size++;

        System.out.println("Enter array index");
        int index = scan.nextInt();

        System.out.println("Enter the value");
        int value = scan.nextInt();
if(index >=0 && index <=size){
for(int i = size; i>=index; i--){
    arr[i] = arr[i-1];
}
arr[index] = value;
}
for(int i=0; i<=size; i++){
    System.out.print(arr[i] + " ");
}
scan.close();
    }
}