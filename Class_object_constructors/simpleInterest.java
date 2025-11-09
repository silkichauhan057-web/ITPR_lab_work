    package Lab_16Oct;

import java.util.*;

class SimpleInterest {
    double p, r, t;

    // Constructor
    SimpleInterest(double p, double r, double t) {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    double calculate() {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest(p, r, t);
        double si = obj.calculate();

        System.out.println("Simple Interest = " + si);
    }
}
