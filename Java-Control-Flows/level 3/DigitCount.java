import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;  // Variable to store digit count
        int temp = number;  // Copy of number for processing

        // Step 2: Loop until number becomes 0
        while (temp != 0) {
            temp = temp / 10;  // Remove last digit
            count++;           // Increment counter
        }

        // Step 3: Output result
        System.out.println("The number " + number + " has " + count + " digits.");
    }
}