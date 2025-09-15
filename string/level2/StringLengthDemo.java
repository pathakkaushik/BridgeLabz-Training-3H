package StringFile.level2;

import java.util.Scanner;

public class StringLengthDemo {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception when index >= length
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // when exception occurs, return count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // custom method
        int customLen = findLength(input);

        // built-in length()
        int builtinLen = input.length();

        System.out.println("Custom Length (without length()): " + customLen);
        System.out.println("Built-in Length (with length()): " + builtinLen);

        sc.close();
    }
}
