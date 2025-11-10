package String;

import java.util.Scanner;

class Student {

    String name;
    String age;
    String standard;
    String rollNo;

    // Method to take input
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextLine();

        System.out.print("Enter Standard: ");
        standard = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextLine();
    }

    // Method to display
    void display() {
        System.out.println("\n=== STUDENT DETAILS ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Standard: " + standard);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.getData();
        s.display();
    }
}
