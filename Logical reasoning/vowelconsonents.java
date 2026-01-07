import java.util.Scanner;
public class vowelconsonents{
    public static void main(String[]args){
        System.out.println("Enter the sentence");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int vowels = 0;
        int consonants = 0;
        sentence = sentence.toLowerCase();
        for(int i=0;i< sentence.length();i++){
            char jagan = sentence.charAt(i);
            if(jagan>='a' || jagan<='z'){
                if(jagan =='a' || jagan == 'e' || jagan == 'i' || jagan == 'o' || jagan == 'u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Total vowels are:" + vowels);
        System.out.println("Total consonents are" + consonants);
    } 
}