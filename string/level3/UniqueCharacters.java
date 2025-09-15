package StringFile.level3;

import java.util.Scanner;

public class UniqueCharacters {
    // Method to calculate length without length() method
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] findUnique(String text) {
        int n = getLength(text);
        char[] result = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[k++] = c;
            }
        }

        char[] unique = new char[k];
        for (int i = 0; i < k; i++) {
            unique[i] = result[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        sc.close();
    }
}
