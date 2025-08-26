package Level2Practice;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        if (number < 0) {
            number = -number; // handle negative numbers
        }

        // Step 2: Find digits in the number and store them in an array
        String numStr = Long.toString(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int
        }

        // Step 3: Define frequency array of size 10
        int[] frequency = new int[10];

        // Step 4: Count frequency
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Step 5: Display frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
