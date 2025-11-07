
// Custom exception class
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

public class Rectangle {
    private double length;
    private double breadth;

    // Constructor with validation
    public Rectangle(double length, double breadth) throws InvalidDimensionException {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidDimensionException("Length and breadth must be positive values!");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + breadth);
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Creating a valid rectangle
            Rectangle r1 = new Rectangle(5, 3);
            System.out.println("Area: " + r1.area());
            System.out.println("Perimeter: " + r1.perimeter());

            // Creating an invalid rectangle to trigger exception
            Rectangle r2 = new Rectangle(-4, 6);
            System.out.println("Area: " + r2.area());
        } 
        catch (InvalidDimensionException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}