// reversedString 
// ----------------------------------
import java.util.*;
// public class practice{
//     public static void main(String[]args){
// Scanner scan = new Scanner(System.in);
// System.out.println("Enter the String");
// String print = scan.nextLine();
// String reversed = "";
// for(int i=print.length()-1;i>=0;i--){
//     reversed+=print.charAt(i);
// }
// System.out.println("reverd string is");
// System.out.println(reversed);
//     }
// }

// 2. How do you swap two numbers without using a third variable in Java?
// public class practice{
//     public static void main(String[]args){
// Scanner scan = new Scanner(System.in);
// int a = scan.nextInt();
// int b = scan.nextInt();
//  b = b+a;
//  a = b-a;
//  b = b-a;
//  System.out.println("a=" + a);
//  System.out.println("b=" + b);
//     }
// }

// 3. Write a Java program to check if a vowel is present in a string
// public class practice{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         String enter = scan.nextLine().toLowerCase();
//         boolean isPresent = false;
//         for(int i=0; i< enter.length(); i++){
//             char ch = enter.charAt(i);
//             if(ch=='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 isPresent = true;
//                 break;
//             }
//         }
//         if(isPresent){
//             System.out.println("Vowels is present");
//         }else{
//             System.out.println("Vowels are not present");
//         }
//     }
// }

// prime number
// public class practice{
//     public static void main(String [] args){
//         Scanner scan = new Scanner(System.in);
//         int enter = scan.nextInt();
//            boolean isPrime = true;
//         if(enter<=0){
// System .out.println("Invalid prime number");
//         }
// else{
 
// for(int i=2; i<=Math.sqrt(enter); i++){
// if(enter%i==0){
//     isPrime = false;
//     break;
// }

// }
// }
// if(isPrime){
//     System.out.println("Prime number is pressent");
// }
// else{
// System.out.println("Prime number is not present");
// }

        
    
// }
// }

// palindrome
// public class practice{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         String enter = scan.nextLine().toLowerCase();
//         String original = enter;
//         String reversed = "";
//         for(int i =enter.length()-1; i>=0;i--){
// reversed+=enter.charAt(i);
//         }
//         if(reversed.equals(original)){
//             System.out.println("palindrome");
//         }else{
//             System.out.println("not palindrome");
//         }

//     }
// }
// factorial nmberu
// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int enter = scan.nextInt();
//         long factorial = 1;
//         if(enter<0){
//             System.out.println("Invalid number");
           
//         }else{
// for(int i =1; i<=enter;i++){
//     factorial = factorial*i;
// }
//         }
//         System.out.println(factorial);
        
//     }
// }
// fibbonacci
// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         int a=0
//         int b=1;
//         for(int i=0; i<=num; i++){
//             int next = a+b;
//             a = b;
//             b = next;
//         }

//     }
// }


// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = scan.nextInt();
//         }
//         int max = arr[0];
//         for(int j=0; j<arr.length;j++){
// if(arr[j] > max){
//     max = arr[j];
// }
//         }
//         int secondLarge = Integer.MIN_VALUE;
//         for(int k=0; k< arr.length; k++){
//             if(arr[k] != max && arr[k] > secondLarge){
//                 secondLarge = arr[k];
//             }
//         }
//         System.out.println(secondLarge);
//     }
// }
//  public class practice{
//     public static void main(String[]args){
// Scanner scan = new Scanner(System.in);
// int sc = scan.nextInt();
// int arr[] = new int[sc];
// for(int i=0; i<arr.length;i++){
//     arr[i] = scan.nextInt();
// }
// int max = arr[0];
// for(int j=1; j<arr.length; j++){
//     if(arr[j]>max){
//         max = arr[j];
//     }
// }
// System.out.println(max);
//     }
//  }

// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int sc = scan.nextInt();
//         int arr[] = new int[sc];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = scan.nextInt();
//         }
//         HashSet<Integer>set = new HashSet<>();
//         for(int num : arr){
//             set.add(num);
//         }
//         for(int num: set){
//             System.out.println(num + " ");
//         }
//     }
// }

// public class practice{
//     public static void main(String []args){
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = scan.nextInt();
//         }
//         int start =0;
//         int end = arr.length-1;
//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//         for(int j=0; j<arr.length; j++){
//             System.out.println(arr[j] + " ");
//         }

//     }
// }

// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int enter = scan.nextInt();
//         int arr[] = new int[enter];
//         for(int i=0; i< enter; i++){
//             arr[i] = scan.nextInt();
//         }
//         int max = arr[0];
//         for(int j=0; j< arr.length; j++){
//             if(arr[j]>max){
//                 max = arr[j];
//             }
//         }
//         System.out.println("largest element is " + max);
//     }
// }

// public class practice{
//     public static void main(String [] args){
//         Scanner scan = new Scanner(System.in);
//         int enter = scan.nextInt();
//         int arr[] = new int[enter];
//         for(int i=0; i < enter; i++){
//             arr[i] = scan.nextInt();
//         }
//         int min = arr[0];
//         for(int j=0; j<arr.length; j++){
//             if(arr[j]<min){
//                 min = arr[j];
//             }
//         }
//         System.out.println("smallest element is" + min);
//     }
// }


// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int enter = scan.nextInt();
//         int arr[] = new int[enter];
//         for(int i=0; i<enter; i++){
//             arr[i] = scan.nextInt();
//         }
//         int max = arr[0];
//         for(int j=0; j< arr.length; j++){
//             if(arr[j]>max){
//                 max = arr[j];
//             }
//         }
//         int secondLarge = Integer.MIN_VALUE;
//         for(int k=0; k<arr.length; k++){
//             if(arr[k] != max && arr[k]>secondLarge){
//                 secondLarge = arr[k];
//             }
//         }
//         System.out.println(secondLarge);

//     }
// }


// public class practice{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the array size");
//         int enter = scan.nextInt();
//         int arr[] = new int[enter];
//         for(int i=0; i< enter; i++){
//             arr[i] = scan.nextInt();
//         }
//         System.out.println("Enter the target element");
//         int target = scan.nextInt();
//         boolean isPreasent = false;
//         for(int i=0; i<arr.length; i++){
// if(arr[i]==target){
//     System.out.println("your targeted element is" + " " + target + " " + "present");
//     isPreasent = true;
//     break;
// }
//         }
//         if(!isPreasent){
//             System.out.println("your targeted element is " + " " + target + " " + "element is not present");
//         }
//     }
// }

// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int enter = scan.nextInt();
//         int arr[] = new int[enter];
//         int sum = 0;
//         for(int i=0; i< enter; i++){
//             arr[i] = scan.nextInt();
//         }
//         for(int i=0; i< enter; i++){
//             sum = arr[i]+sum;
//         }
//         System.out.println("sum of elements are" + " " + sum);
//     }
// }

// public class practice{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         int enter = scan.nextInt();
//         int arr[] = new int[enter];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = scan.nextInt();
//         }
//         int start = 0;
//         int end = arr.length-1;
//         while(start < end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start ++;
//             end--;
//         }
//         System.out.println("reversed elements are");
//         for (int j=0; j<arr.length; j++){
//             System.out.print(arr[j] + " ");
//         }
//     }
// }

public class practice{
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
static void rightRotate(int arr[], int k){
    int n = arr.length;
    k = k%n;
    reverse(arr, 0 , n-1);
    reverse(arr, k, n-1);
    reverse(arr, 0, k-1);
}
static void leftRotate(int arr[], int k){
    int n = arr.length;
    k = k%n;
    rightRotate(arr, n-k);
}
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Array size");
    int n = scan.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter ARRAY Elements");
    for(int i=0; i<n; i++){
        arr[i] = scan.nextInt();
    }
    System.out.println("Enter K Number");
    int k = scan.nextInt();
    System.out.println("Enter L/R");
    char en = scan.next().charAt(0);
    if(en=='L' || en =='l'){
        leftRotate(arr, k);
    }
    else if(en == 'R' || en == 'r'){
        rightRotate(arr, k);
    }
    else{
        System.out.println("INVALID ACCESS DENIED");
        return;
    }
    for(int num : arr){
        System.out.print(num + " ");
    }
}
    
}
