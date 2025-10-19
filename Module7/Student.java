//Sample 5: Constructor Overloading Example with User Input
package Module7;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double grade;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.grade = 0.0;
    }

    // Constructor with name and ID
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grade = 0.0;
    }

    // Constructor with name, ID, and grade
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to add? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Do you want to enter a grade? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter grade: ");
                double grade = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                students[i] = new Student(name, id, grade); // Three-parameter constructor
            } else {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                students[i] = new Student(name, id); // Two-parameter constructor
            }
        }

        // Display all student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}