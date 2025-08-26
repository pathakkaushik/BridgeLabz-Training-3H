package Level2Practice;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step b: Arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Step c: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            physics[i] = getValidMarks(sc, "Physics");
            chemistry[i] = getValidMarks(sc, "Chemistry");
            maths[i] = getValidMarks(sc, "Maths");

            // Step d: Calculate percentage
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            // Step d: Find grade
            grade[i] = calculateGrade(percentage[i]);
        }

        // Step e: Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-8s%n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-8s%n",
                    physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

        sc.close();
    }

    // Helper: Valid marks input
    private static int getValidMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + " marks (0-100): ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) break;
            System.out.println("Invalid! Marks must be between 0 and 100.");
        }
        return marks;
    }

    // Helper: Calculate grade
    private static String calculateGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }
}
