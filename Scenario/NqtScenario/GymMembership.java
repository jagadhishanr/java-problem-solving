// Gym Membership Cost – Problem Statement
// A gym offers membership plans based on the number
// of months a customer wants to enroll. The cost
// of the membership is determined as follows:
// Duration (Months)	Cost (₹)
// ≤ 0	               Invalid Input
// 1	               2000
// 2 to 3	           5000
// 4 to 6	           9000
// > 6	               15000

import java.util.*;
public class GymMembership{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int months = scan.nextInt();
        if(months <= 0){
            System.out.println("Invalid input");
        }
        else if(months == 1){
            System.out.println("Cost: 2000");
        }
        else if(months <= 3){
            System.out.println("Cost: 5000");
        }
        else if(months <= 6){
            System.out.println("Cost: 9000");
        }
        else{
            System.out.println("Cost: 15000");
        }
    }
}