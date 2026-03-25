import java.util.*;
class car{
    String brand;
    String model;
    double price;

car(String brand, String model, double price){
    this.brand = brand;
    this.model = model;
    this.price = price;
}

void displayDetails(){
    System.out.println("Brand name:" + brand);
    System.out.println("Model name:" + model);
    System.out.println("Price:" + price);
}
}
public class carInfo{
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    car[] cars = new car[3];
    for(int i =0; i<3; i++){
        System.out.println("Enter brand name" + (i+1));
        String brand = scan.nextLine();

        System.out.println("Enter Model name");
        String model = scan.nextLine();

        System.out.println("Enter budget");
        double price = scan.nextDouble();
        scan.nextLine();

        cars[i] = new car(brand, model, price);
    }
    for(int i=0; i<3; i++){
        cars[i].displayDetails();
    }
}
}