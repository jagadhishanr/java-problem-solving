import java.util.Scanner;

public class countDuplicate {

    // Method to reverse part of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Right rotate array by k positions
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Left rotate array by k positions
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        rightRotate(arr, n - k); // convert left to right rotation
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotation count k: ");
        int k = sc.nextInt();

        System.out.print("Rotate Left or Right (L/R): ");
        char choice = sc.next().charAt(0);

        if (choice == 'R' || choice == 'r') {
            rightRotate(arr, k);
        } else if (choice == 'L' || choice == 'l') {
            leftRotate(arr, k);
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
