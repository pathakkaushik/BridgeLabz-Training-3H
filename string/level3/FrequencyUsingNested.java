package StringFile.level3;

import java.util.Scanner;

public class FrequencyUsingNested {
    public static String[] frequencyNested(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[j] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (char c : chars)
            if (c != '0')
                count++;

        String[] result = new String[count];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[k++] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] freq = frequencyNested(text);
        System.out.println("Character Frequencies:");
        for (String s : freq) {
            System.out.println(s);
        }
        sc.close();
    }
}
