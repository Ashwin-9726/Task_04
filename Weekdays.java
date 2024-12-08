// Weekdays in array
import java.util.Scanner;

   public class Weekdays {

        public static void main(String[] args) {
            // Array to store names of weekdays starting from index 0 (Sunday)
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            // Create Scanner to read user input
            Scanner scanner = new Scanner(System.in);

            try {
                // Ask user to input a day index
                System.out.print("Enter the day index (0-6): ");
                int index = scanner.nextInt();

                // Handle index and check array bounds
                System.out.println("The day at index " + index + " is: " + weekdays[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle invalid index exception
                System.out.println("Error: Index out of range. Please enter a number between 0 and 6.");
            } finally {
                scanner.close(); // Close the scanner to free resources
            }
        }
    }