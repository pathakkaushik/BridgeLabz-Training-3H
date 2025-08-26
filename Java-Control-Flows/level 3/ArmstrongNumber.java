import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;  // Store original number for comparison
        int sum = 0;                  // Variable to hold sum of cubes of digits

        // Step 2: Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += digit * digit * digit;    // Add cube of digit to sum
            originalNumber = originalNumber / 10; // Remove last digit
        }

        // Step 3: Compare result
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}