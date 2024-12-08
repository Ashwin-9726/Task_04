//Student_Grades class using hashmap collection

import java.util.HashMap;
import java.util.Scanner;

public class Student_Grades {

    // HashMap to store student names as keys and grades as values
    private HashMap<String, Integer> Student_Grades;

    // Constructor to initialize the HashMap
    public Student_Grades() {
        Student_Grades = new HashMap<>();
    }

    // Method to add a new student with their grade
    public void addStudent(String name, Integer grade) {
        Student_Grades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    // Method to remove a student by their name
    public void removeStudent(String name) {
        if (Student_Grades.containsKey(name)) {
            Student_Grades.remove(name);
            System.out.println("Student " + name + " has been removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by their name
    public void displayGrade(String name) {
        if (Student_Grades.containsKey(name)) {
            System.out.println("Grade of " + name + ": " + Student_Grades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        // Create an instance of StudentGrades
        Student_Grades grades = new Student_Grades();
        Scanner scanner = new Scanner(System.in);

        // Menu for user interaction
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Display student's grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade for " + name + ": ");
                    Integer grade = scanner.nextInt();
                    grades.addStudent(name, grade);
                    break;

                case 2:
                    // Remove a student
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    grades.removeStudent(name);
                    break;

                case 3:
                    // Display student's grade
                    System.out.print("Enter student name to display grade: ");
                    name = scanner.nextLine();
                    grades.displayGrade(name);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}