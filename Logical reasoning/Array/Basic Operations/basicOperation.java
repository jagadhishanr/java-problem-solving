import java.util.*;
public class basicOperation{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size" + ":");
        int size = scan.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter Array elements");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter The Element you want to access");
        int index = scan.nextInt();
        if(index >=0 && index < size){
            System.out.println("You Accessed the index" + " " + index + " " + "the element is" + " " + arr[index]);
        }else{
            System.out.println("INVALID ACCESS!");
        }
        System.out.println("Enter the index value of you want to update");
        int updateIndex = scan.nextInt();
        if(updateIndex >=0 && index < size){
            System.out.println("Enter value do you want to update");
                int updatevalue = scan.nextInt();
                arr[updateIndex] = updatevalue;
        }
        else{
            System.out.println("Invalid ACCess");
        }
        System.out.println("The Traversed Array elements are");
        for(int i=0; i< size; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("The length of an array is " + " " + arr.length);
        scan.close();

    }
}
