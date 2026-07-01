package day12.discussion;

import java.util.Scanner;

public class Actvity8_Gabriel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("        Average Calculator");
        System.out.println("====================================");

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        // Ask for number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        scanner.nextLine(); // Clear input buffer

        // Arrays
        String[] subjectNames = new String[subjects];
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];
        double[] averages = new double[students];

        // Input subject names
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();
        }

        // Input student names and grades
        for (int i = 0; i < students; i++) {

            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");

            double total = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = scanner.nextDouble();
                total += grades[i][j];
            }

            averages[i] = total / subjects;
            scanner.nextLine(); // Clear input buffer
        }

        // Display Grades Report
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("          Grades Report");
        System.out.println("====================================");

        // Table Header
        System.out.printf("%-15s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-10s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        // Line Separator
        for (int i = 0; i < (15 + (subjects * 10) + 10); i++) {
            System.out.print("-");
        }
        System.out.println();

        // Display Student Grades
        for (int i = 0; i < students; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-10.0f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }

        scanner.close();
    }
}