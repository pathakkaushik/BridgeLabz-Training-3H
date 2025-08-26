import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input weight (kg) and height (cm)
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Step 2: Convert height to meters
        double heightM = heightCm / 100.0;

        // Step 3: Calculate BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);

        // Step 4: Determine status using BMI table
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Step 5: Print results
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);
    }
}