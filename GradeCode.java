import java.util.Scanner;

public class GradeCode{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Grade Calculator for student ");

        // Take input the marks
        System.out.print("Enter mark 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = scanner.nextInt();

        // Calculating total and average
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        // Determining grade
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Output
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
