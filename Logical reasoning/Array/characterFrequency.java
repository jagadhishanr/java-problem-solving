import java.util.*;
public class characterFrequency{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the String");
String enter = scan.nextLine();
int freq[] = new int[256];
for(int i=0; i<enter.length(); i++){
    char ch = enter.charAt(i);
    if(ch != ' '){
        freq[ch]++;
    }
}
for(int i=0; i<256; i++){
    if(freq[i]>0){
        System.out.println((char)i + ":" + freq[i]);
    }
}
    }
}