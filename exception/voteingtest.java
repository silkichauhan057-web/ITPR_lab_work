// Custom Exception Class
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class voteingtest {

    public static void checkEligibility(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or above to vote.");
        } else {
            System.out.println("✅ Person is eligible to vote.");
        }
    }

    public static void main(String[] args) {

        int age = 16;   // change this value to test

        try {
            checkEligibility(age);
        } 
        catch (AgeNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}











