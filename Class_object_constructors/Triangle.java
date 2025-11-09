package Lab_16Oct;

import java.util.*;

class Triangle {
    double a, b, c;

    // Constructor
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeter() {
        return a + b + c;
    }

    double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        Triangle obj = new Triangle(a, b, c);

        System.out.println("Perimeter = " + obj.perimeter());
        System.out.println("Area = " + obj.area());
    }
}
