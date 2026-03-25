import java.util.*;
class rectangle{
    int area(int length, int breadth){
        return length*breadth;
    }
}
public class RectangleArea{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lengthO = scan.nextInt();
        int breadthT = scan.nextInt();
        
        rectangle r1 = new rectangle();
        int result = r1.area(lengthO, breadthT);
        System.out.println("Area of Rectangle is:" + " " + result);
    }
}