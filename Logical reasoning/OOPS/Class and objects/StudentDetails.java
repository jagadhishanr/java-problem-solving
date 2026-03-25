class student{
    String name;
    long rollNo;
    int marks;
    String status;

    void displayDetails(){
        System.out.println("Student name:" + " " + name);
        System.out.println("Student rollNo" + " " + rollNo);
        System.out.println("Student marks is" + " " + marks);
    }

    void status(){
        System.out.println("Student status is" + " " + status);
    } 
}

public class StudentDetails{
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();

        s1.name = "Jagadhishan";
        s1.rollNo = 54321;
        s1.marks = 432;
        s1.status = "Average";

        s2.name = "Naruto";
        s2.rollNo = 62142;
        s2.marks = 0;
        s2.status = "Excellent";

        s1.displayDetails();
        s1.status();

        s2.displayDetails();
        s2.status();
    }
}