package StringFile.level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to take input for weight and height
    public static double[][] takeInput(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[n][2]; // col[0] = weight (kg), col[1] = height (cm)

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        sc.close();
        return data;
    }

    // Method to calculate BMI and status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 10.0) / 10.0; // round to 1 decimal place

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[] { String.valueOf(bmi), status };
    }

    // Method to compute BMI & status for all persons
    public static String[][] processData(double[][] data) {
        int n = data.length;
        String[][] results = new String[n][4]; // weight, height, BMI, status

        for (int i = 0; i < n; i++) {
            String[] bmiResult = calculateBMI(data[i][0], data[i][1]);

            results[i][0] = String.valueOf(data[i][0]); // weight
            results[i][1] = String.valueOf(data[i][1]); // height
            results[i][2] = bmiResult[0]; // BMI
            results[i][3] = bmiResult[1]; // Status
        }
        return results;
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    // Main function
    public static void main(String[] args) {
        int members = 10; // number of persons

        double[][] inputData = takeInput(members);
        String[][] finalResults = processData(inputData);

        System.out.println("\n--- BMI Report ---");
        displayResults(finalResults);
    }
}
