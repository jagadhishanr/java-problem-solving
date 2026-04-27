import java.util.*;
class circleRadius{
    double radius;

    circleRadius(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
    double calculateCircumstence(){
        return 2 * Math.PI * radius;
    }
}



public class circle{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter radius");
double radius = scan.nextDouble();

circleRadius r1 = new circleRadius(radius);
System.out.println("Area is" + " " + r1.calculateArea());


System.out.println("Circumstence is" + " " + r1.calculateCircumstence());


    }
}