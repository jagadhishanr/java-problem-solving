// Get i/pfrom user in java. And Given a string ****s****, the task is to find 
// the ****maximum consecutive repeating character**** in the string. ****Note:**** We do 
// not need to consider the overall count, but the count of repeating that appears in one place.
//  ****Examples:****  ****Input****: s = "geeekk"****Output****: e****Explanation:**** character e
//   comes 3 times consecutively which is maximum. ****Input****: s = "aaaabbcbbb"****Output****: a****Explanation:**** character a 
//   comes 4 times consecutively which is maximum.

import java.util.*;
public class MaxConsecutiveChar{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s==null || s.length()==0){
            System.out.println("Empty String!");
            return;
        }
        char maxChar = s.charAt(0);
        int MaxCount = 1;

        char currentChar = s.charAt(0);
        int CurrentCount = 1;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==currentChar){
                CurrentCount++;
            }
            else{
                currentChar = s.charAt(i);
                CurrentCount =1; 
            }
            if(CurrentCount > MaxCount){
            MaxCount = CurrentCount;
            maxChar = currentChar;
        }
        } 
        System.out.println("The maximum Consecutive character is:" + " " + maxChar);
        
    }
}