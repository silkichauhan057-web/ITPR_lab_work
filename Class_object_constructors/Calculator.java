package Lab_16Oct;

import java.util.*;

class Calculator {
    int a, b;

    // Constructor
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void calculate() {
        System.out.println("Addition = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Calculator obj = new Calculator(x, y);
        obj.calculate();
    }
}
