// Voter class with attributes voterId, name, and age
public class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getter methods for accessing private fields
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        try {
            // Attempt to create a voter with valid age
            Voter voter1 = new Voter(101, "Ashwin", 27);
            System.out.println("Voter created: " + voter1.getName() + ", Age: " + voter1.getAge());

            // Attempt to create a voter with invalid age
            Voter voter2 = new Voter(102, "Ganesh", 16);
            System.out.println("Voter created: " + voter2.getName() + ", Age: " + voter2.getAge());
        } catch (InvalidAgeException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }
    }
}