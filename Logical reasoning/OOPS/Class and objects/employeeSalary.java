import java.util.*;
class employee{
    String name;
    int id;
    double salary;

    employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void increaseSalary(double percentage){
        salary = salary + (salary*percentage/100);
    }

    void displayDetails(){
        System.out.println("Employee name" + " " + name);
        System.out.println("Employee id" + " " + id);
        System.out.println("Employee salary" + " " + salary);
    }
}

public class employeeSalary{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter employee name");
        String name = scan.nextLine();

        System.out.println("Enter employee ID");
        int id = scan.nextInt();

        System.out.println("Enter employee salary");
        double salary = scan.nextDouble();

         employee e1 = new employee(name, id, salary);
          
          System.out.println("Enter percentage to increase the salary");
          double percent = scan.nextDouble();

          e1.increaseSalary(percent);

          System.out.println("Updated salary details is");
          e1.displayDetails();

    }
}

