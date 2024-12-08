package StudentManagementSystem;
// Custom exception for invalid age
public class AgeNotWithinRangeException extends Exception{

    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
