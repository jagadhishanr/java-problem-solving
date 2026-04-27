import java.util.*;

// Interface (Bonus - Multiple Inheritance)
interface Insurance {
    double calculateInsurance();
}

// Abstract Class (Abstraction)
abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private double rentPerDay;

    // Constructor
    public Vehicle(String vehicleId, String brand, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    // Getters & Setters (Encapsulation)
    public String getVehicleId() { return vehicleId; }
    public String getBrand() { return brand; }
    public double getRentPerDay() { return rentPerDay; }

    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setRentPerDay(double rentPerDay) { this.rentPerDay = rentPerDay; }

    // Abstract Method
    public abstract double calculateRent(int days);

    // Concrete Method
    public void displayDetails() {
        System.out.println("ID: " + vehicleId + ", Brand: " + brand + ", Rent/Day: " + rentPerDay);
    }
}

// Car Class
class Car extends Vehicle implements Insurance {
    private int numberOfDoors;

    public Car(String id, String brand, double rent, int doors) {
        super(id, brand, rent);
        this.numberOfDoors = doors;
    }

    @Override
    public double calculateRent(int days) {
        double total = getRentPerDay() * days;
        if (days > 5) {
            total *= 0.9; // 10% discount
        }
        return total;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }
}

// Bike Class
class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String id, String brand, double rent, int engineCapacity) {
        super(id, brand, rent);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRent(int days) {
        return getRentPerDay() * days;
    }
}

// Truck Class
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String id, String brand, double rent, double loadCapacity) {
        super(id, brand, rent);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRent(int days) {
        return (getRentPerDay() * days) + (loadCapacity * 100);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose Vehicle Type: 1.Car  2.Bike  3.Truck");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Rent per Day: ");
            double rent = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of doors: ");
                    int doors = sc.nextInt();
                    vehicles.add(new Car(id, brand, rent, doors));
                    break;

                case 2:
                    System.out.print("Enter engine capacity: ");
                    int cc = sc.nextInt();
                    vehicles.add(new Bike(id, brand, rent, cc));
                    break;

                case 3:
                    System.out.print("Enter load capacity: ");
                    double load = sc.nextDouble();
                    vehicles.add(new Truck(id, brand, rent, load));
                    break;

                default:
                    System.out.println("Invalid choice");
                    i--;
            }
        }

        System.out.print("\nEnter number of rental days: ");
        int days = sc.nextInt();

        System.out.println("\n--- Rental Details ---");

        // Polymorphism (Runtime)
        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rent = v.calculateRent(days);
            System.out.println("Total Rent: " + rent);

            // Interface usage
            if (v instanceof Insurance) {
                Insurance ins = (Insurance) v;
                System.out.println("Insurance: " + ins.calculateInsurance());
            }

            System.out.println("-------------------");
        }

        sc.close();
    }
}