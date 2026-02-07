import java.util.*;
public class arrangeAscDsc{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int [] arr = new int[10];
System.out.println("Enter 10 elements");
for(int i=0; i<arr.length;i++){
    arr[i] =scan.nextInt();
}
    
int [] firstHalf = Arrays.copyOfRange(arr,0,5);
int [] secondHalf = Arrays.copyOfRange(arr,5,10);
Arrays.sort(firstHalf);
Arrays.sort(secondHalf);
for(int i=0; i<secondHalf.length/2;i++){
int temp = secondHalf[i];
 secondHalf[i] = secondHalf[secondHalf.length-1-i];
 secondHalf[secondHalf.length-1-i]=temp;
}
for(int i=0; i<5;i++){
    arr[i] = firstHalf[i];
    arr[i+5] = secondHalf[i];
}
System.out.println("Arranged elements is");
for(int num:arr){
    System.out.println(num);
}
    }
}

// ### 🎯 Goal

// You have **10 numbers**.

// * **First 5** → must be in **ascending order**
// * **Next 5** → must be in **descending order**

// ---

// ## 🪜 Step-by-Step Logic (Big Picture)

// ### 🔹 Step 1: Take input

// * Read **10 numbers** from the user
// * Store them in one array `arr`

// 👉 At this point, numbers are **random order**

// ---

// ### 🔹 Step 2: Divide the problem

// Instead of trying to sort everything at once, the program:

// * Splits the array into **two smaller parts**

//   * First 5 numbers
//   * Last 5 numbers

// Why?
// 👉 Smaller problems are **easier to handle**

// ---

// ### 🔹 Step 3: Sort first half (easy part)

// * Sort the **first 5 numbers** in **ascending order**
// * Java already provides this using `Arrays.sort()`

// So:

// ```
// small → big
// ```

// ---

// ### 🔹 Step 4: Sort second half (tricky part)

// Java **cannot directly sort int arrays in descending order**, so we use a **two-step trick**:

// #### 🪄 Trick used:

// 1. Sort the second half in **ascending order**
// 2. **Reverse** it manually

// Reversing means:

// * Swap first ↔ last
// * Second ↔ second-last
// * Stop at the middle

// This turns:

// ```
// ascending → descending
// ```

// ---

// ### 🔹 Step 5: Combine results

// Now we have:

// * First half → ascending
// * Second half → descending

// Put them back into the original array:

// * Positions `0–4` → ascending numbers
// * Positions `5–9` → descending numbers

// ---

// ## 🧩 Logic in One Sentence (Exam-Ready)

// > The program reads 10 elements, splits them into two halves, sorts the first half in ascending order, sorts the second half in ascending order and reverses it to obtain descending order, and finally merges both halves back into a single array.

// ---

// ## 🧠 Key Idea You Should Remember

// * **Divide → Process → Combine**
// * Sorting descending = **sort + reverse**
// * Loop runs only **half the array** when reversing