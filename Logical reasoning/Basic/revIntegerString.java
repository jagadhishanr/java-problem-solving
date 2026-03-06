import java.util.*;
public class revIntegerString{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
System.out.println("Enter the integer");
int number = scan.nextInt();
scan.nextLine();
System.out.println("Enter the String");
String enter = scan.nextLine();

int reverse = 0;
while(number!=0){
    int temp = number%10;
    reverse = reverse*10 + temp;
    number = number/10;
}

System.out.println("reversed intergers are " + ":" + reverse);
String ch = " ";
for(int i= enter.length()-1; i>=0; i--){
ch+=enter.charAt(i);
}
System.out.println("reversed String is" + ":" +ch);

    }
}