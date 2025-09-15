package StringFile.level2;

import java.util.Random;

public class StudentGrades {

    // Method to generate random marks for n students
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3]; // Physics, Chemistry, Maths
        for (int i = 0; i < n; i++) {
            marks[i][0] = 40 + rand.nextInt(61); // Physics (40-100)
            marks[i][1] = 40 + rand.nextInt(61); // Chemistry (40-100)
            marks[i][2] = 40 + rand.nextInt(61); // Maths (40-100)
        }
        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = (double) total / 3.0;
            double perc = ((double) total / 300.0) * 100.0;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        int n = results.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double perc = results[i][2];
            if (perc >= 80)
                grades[i] = "A";
            else if (perc >= 70)
                grades[i] = "B";
            else if (perc >= 60)
                grades[i] = "C";
            else if (perc >= 50)
                grades[i] = "D";
            else if (perc >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    // Method to display result in tabular format
    public static void displayResults(int[][] marks, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-10s%n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-12.2f %-10s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int students = 5; // number of students (can change)

        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);
        String[] grades = calculateGrades(results);

        displayResults(marks, results, grades);
    }
}
