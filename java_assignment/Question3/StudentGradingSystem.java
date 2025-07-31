// StudentGradingSystem.java
// Aaryaman Khatiwada, section-H
import java.util.Scanner;

// Custom Exception to handle invalid mark entries
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

public class StudentGradingSystem {
    // Method to determine grade based on marks
    public static String getGrade(int marks) {
        if (marks > 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine().trim();
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

            System.out.print("Enter marks (0-100): ");
            String markInput = scanner.nextLine();
            int marks = Integer.parseInt(markInput);

            if (marks < 0 || marks > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100.");
            }

            String grade = getGrade(marks);
            System.out.println("Student: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric marks.");
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Grading process complete.");
            scanner.close();
        }
    }
}
