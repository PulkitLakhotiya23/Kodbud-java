
import java.util.Scanner;

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Input marks in three subjects
        System.out.print("Enter marks in Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double m3 = sc.nextDouble();

        // Calculate average
        double average = (m1 + m2 + m3) / 3;

        // Calculate grade
        String grade;

        if (average >= 80) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Display student report
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Student Name: " + name);
        System.out.println("Subject 1 Marks: " + m1);
        System.out.println("Subject 2 Marks: " + m2);
        System.out.println("Subject 3 Marks: " + m3);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}


