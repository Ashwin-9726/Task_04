package StudentManagementSystem;
// Student class with attributes and validations
public class Student {
    private int roll_No;
    private String name;
    private int age;
    private String Course;
    // Getter methods for accessing private fields
    public int getRoll_No() {
        return roll_No;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return Course;
    }

    // Parameterized constructor to initialize attributes
    public Student(int roll_No, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException {

        // Validate the name
        if (!isNameValid(name)) {
            throw new NameNotValidException("Name contains invalid characters or numbers.");
        }

        // Validate the age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        this.roll_No = roll_No;
        this.name = name;
        this.age = age;
        this.Course = course;
    }
    // Helper method to check if the name is valid (no numbers or special characters)
    private boolean isNameValid(String name) {
        return name.matches("[a-zA-Z ]+"); // Allows only alphabets and spaces
    }
    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll No: " + roll_No);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + Course);
    }
    // Main method for testing
    public static void main(String[] args) {
        try {
            // Attempt to create a valid Student
            Student student = new Student(1, "Ashwin", 18, "Computer Science");
            student.displayStudentDetails();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Age error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Name error: " + e.getMessage());
        }

        try {
            // Attempt to create a Student with invalid age
            Student invalidAgeStudent = new Student(2, "Ramesh", 22, "Mathematics");
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Age error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Name error: " + e.getMessage());
        }

        try {
            // Attempt to create a Student with invalid name
            Student invalidNameStudent = new Student(3, "Aravind123", 20, "Physics");
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Age error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Name error: " + e.getMessage());
        }
    }
}

