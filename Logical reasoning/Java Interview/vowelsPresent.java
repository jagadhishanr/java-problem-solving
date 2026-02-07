import java.util.Scanner;
public class vowelsPresent{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the String");
String input  = scan.nextLine().toLowerCase();
boolean isPresent = false;
for(int i=0; i<input.length(); i++){
    char ch = input.charAt(i);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        isPresent = true;
        break;
    }
}
if(isPresent){
    System.out.println("Vowels has been present");
}else{
    System.out.println("Vowels has not been present");
}

    }
}