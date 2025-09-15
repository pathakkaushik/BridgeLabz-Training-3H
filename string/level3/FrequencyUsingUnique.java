package StringFile.level3;

import java.util.Scanner;

public class FrequencyUsingUnique {
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
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

    public static String[][] frequencyWithUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = frequencyWithUnique(text);
        System.out.println("Character Frequencies:");
        for (String[] row : freq) {
            System.out.println(row[0] + " : " + row[1]);
        }
        sc.close();
    }
}
