package StringFile.level3;

import java.util.Scanner;

public class FrequencyUsingASCII {
    public static int[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0)
                count++;
        }

        int[][] result = new int[count][2];
        int k = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[k][0] = i;
                result[k][1] = freq[i];
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[][] freq = frequency(text);
        System.out.println("Character Frequencies:");
        for (int[] row : freq) {
            System.out.println((char) row[0] + " : " + row[1]);
        }
        sc.close();
    }
}
