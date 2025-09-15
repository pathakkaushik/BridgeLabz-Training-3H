import java.util.*;

public class StudentMarks {

    // Method to generate random 2-digit marks for each subject
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3]; // 3 subjects: Physics, Chemistry, Maths

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(51) + 50; // random marks between 50-100
            }
        }
        return marks;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // Method to get grade according to percentage
    public static String getGrade(double percent) {
        if (percent >= 80)
            return "A";
        else if (percent >= 70)
            return "B";
        else if (percent >= 60)
            return "C";
        else if (percent >= 50)
            return "D";
        else if (percent >= 40)
            return "E";
        else
            return "R";
    }

    // Method to display all student scores
    public static void display(int[][] marks, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < marks.length; i++) {
            String grade = getGrade(results[i][2]);
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n",
                    (i + 1),
                    marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2], grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] results = calculateResults(marks);
        display(marks, results);
        sc.close();
    }
}
