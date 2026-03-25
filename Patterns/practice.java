import java.util.*;
// public class practice{
//     public static void main(String[]args){
//         System.out.println("Enter input");
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
// System.out.println();
//         }
//     }
// }

// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int n=scan.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// public class practice{
//     public static void main(String[]args){
//         Scanner scan = new Scanner(System.in);
//         int n =  scan.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
 public class practice{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }