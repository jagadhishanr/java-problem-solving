// import java.util.*;
// class delivery{
//     String name;
//     String vehicle;
//     int age;

//     void deliveryStatus(){
//         System.out.println(name + "delivery is dispatched and came in vehicle" + vehicle);
//     } 

//     void deliveryOrder(){
//         System.out.println("Name:" + " " + name);
//         System.out.println("Vehicle is:" + " " + vehicle);
//         System.out.println("Age is:" + " " + age);
//     }
// }
// public class practice{
//     public static void main(String[]args){
//         delivery d1 = new delivery();
//         d1.name = "jagan";
//         d1.vehicle = "BMW";
//         d1.age = 22;

//         delivery d2 = new delivery();
//         d2.name = "naruto";
//         d2.vehicle = "benz";
//         d2.age = 33;

//         d1.deliveryOrder();
//         d1.deliveryStatus();

//         d2.deliveryOrder();
//         d2.deliveryStatus();
//     }
// }



class pizzaShop{
    void pizzaSize(String size){
        System.out.println("pizza:" + " " + size + " " + "Here");
    }
}

public class practice{
    public static void main(String[]args){
        pizzaShop p1 = new pizzaShop();
        pizzaShop p2 = new pizzaShop();
        p1.pizzaSize("Large");
        p2.pizzaSize("Medium");
    }
}