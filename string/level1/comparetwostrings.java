package string.level1;
import java.util.*;
public class comparetwostrings {
    public static boolean compareWithCharAt(String s1, String s2) {
        // If lengths differ, they can't be equal
        if (s1 == null || s2 == null) {
            return s1 == s2; // both null -> true, else false
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next(); // reads up to whitespace

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Use our charAt-based comparison
        boolean resultCharAt = compareWithCharAt(str1, str2);

        // Use built-in equals() to check equality
        boolean resultEquals = str1.equals(str2);

        // Display results
        System.out.println("Result using compareWithCharAt: " + resultCharAt);
        System.out.println("Result using String.equals(): " + resultEquals);

        // Optional: show whether both methods agree
        boolean agree = (resultCharAt == resultEquals);
        System.out.println("Do both methods agree? " + agree);

    
    }
}
