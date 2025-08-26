package Level2Practice;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: Create 2D array and status array
        // Columns: [0] = Height, [1] = Weight, [2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Step 3: Take input for weight & height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            double height, weight;
            while (true) {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                System.out.print("Enter weight in kilograms: ");
                weight = sc.nextDouble();

                if (height > 0 && weight > 0) {
                    break; // valid input
                } else {
                    System.out.println("Height and weight must be positive! Please re-enter.");
                }
            }

            // Store height & weight
            personData[i][0] = height;
            personData[i][1] = weight;

            // Step 4: Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
