package conditional;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3, s4, s5;

        System.out.print("Enter marks of Subject 1: ");
        s1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        s2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        s3 = sc.nextInt();
        System.out.print("Enter marks of Subject 4: ");
        s4 = sc.nextInt();
        System.out.print("Enter marks of Subject 5: ");
        s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (total / 500.0) * 100;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Grade Calculation
        if(percentage >= 75){
            System.out.println("Grade: A+");
        }
        else if(percentage >= 65){
            System.out.println("Grade: A");
        }
        else if(percentage >= 55){
            System.out.println("Grade: B");
        }
        else if(percentage >= 45){

            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: Fail");
        }
    }
}
