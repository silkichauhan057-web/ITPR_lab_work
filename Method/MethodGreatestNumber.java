import java.util.Scanner;

public class MethodGreatestNumber {
    // Method to find greatest number
    static int findGreatest(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = findGreatest(a, b, c);
        System.out.println("Greatest number = " + greatest);

        sc.close();
    }
}
