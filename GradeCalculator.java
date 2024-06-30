import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for maximum marks and grade boundaries
        final int MAX_MARKS_PER_SUBJECT = 100;
        final int NUM_SUBJECTS = 5;
        final int MAX_TOTAL_MARKS = MAX_MARKS_PER_SUBJECT * NUM_SUBJECTS;

        // Variables to store marks and calculations
        int totalMarks = 0;
        double averagePercentage;
        char grade;

        // Input marks for each subject
        for (int i = 1; i <= NUM_SUBJECTS; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate input marks
            if (marks < 0 || marks > MAX_MARKS_PER_SUBJECT) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        averagePercentage = (double) totalMarks / MAX_TOTAL_MARKS * 100;

        // Assign grade based on average percentage
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
