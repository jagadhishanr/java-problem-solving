class array{
    int [] arr;
    int capacity;
    int size;
    array(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    boolean insert (int index, int element){
        if(index < 0|| size >= capacity || size > capacity){
            System.out.println("Invalid");
            return true;
        }
        for(int i = size; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        size ++;
        return true;
    }

    void display(){
        for(int i=0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class arrayCodeAdt{
    public static void main(String[]args){
        array arr1 = new array(5);
        System.out.println("array capacity is" + " " + arr1.capacity);
        arr1.insert(0,2);
        arr1.insert(1,8);
        arr1.insert(-33,9);
        arr1.display();


    }
}