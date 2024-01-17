package Example54;

import java.util.Scanner;

// Student class implementing StudentFee interface
public class Student implements StudentFee {
    private String name;
    private double fees;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Implementing the method from the interface
    @Override
    public void getFee() throws InvalidFeeException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fees for " + name + ": ");
        double enteredFee = scanner.nextDouble();

        // Check for invalid or negative fees
        if (enteredFee < 0) {
            throw new InvalidFeeException("Invalid or negative fees entered for " + name);
        }

        fees = enteredFee;
        System.out.println(name + "'s fees set to: " + fees);
    }

    // Additional methods for getting and displaying student information
    public String getName() {
        return name;
    }

    public double getFees() {
        return fees;
    }

    public void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("Fees: " + fees);
    }


    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student("John");

        try {
            // Getting fees for the student
            student.getFee();
        } catch (InvalidFeeException e) {
            System.out.println(e.getMessage());
        }

        // Displaying student information
        student.displayInfo();
    }
}