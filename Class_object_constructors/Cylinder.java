package Lab_16Oct;


import java.util.*;

class Cylinder {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double curvedSurfaceArea() {
        return 2 * Math.PI * r * h;
    }

    double totalSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        Cylinder obj = new Cylinder(r, h);

        System.out.println("Curved Surface Area = " + obj.curvedSurfaceArea());
        System.out.println("Total Surface Area = " + obj.totalSurfaceArea());
        System.out.println("Volume = " + obj.volume());
    }
}
