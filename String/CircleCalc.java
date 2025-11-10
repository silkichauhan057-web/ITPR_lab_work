package String;

import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        String rad = sc.nextLine();   // taking radius as String

        double r = Double.parseDouble(rad);   // converting String → double

        double area = Math.PI * r * r;        // πr²
        double perimeter = 2 * Math.PI * r;   // 2πr

        System.out.println("Area of Circle = " + area);
        System.out.println("Perimeter of Circle = " + perimeter);

        sc.close();
    }
}
