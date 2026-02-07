import java.util.Scanner;
public class revString{
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the String");
String input = scan.nextLine();
String reversed = "";
for(int i=input.length()-1; i>=0; i--){
    reversed+=input.charAt(i);
}
System.out.println("Reversed string is");
System.out.println(reversed);
    }
}