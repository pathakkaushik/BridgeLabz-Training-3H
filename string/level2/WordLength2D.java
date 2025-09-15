package StringFile.level2;

import java.util.Scanner;

public class WordLength2D {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true)
                str.charAt(count++);
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int len = findLength(text), spaces = 0;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                spaces++;
        String[] words = new String[spaces + 1];
        int start = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start, len);
        return words;
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] table = wordLengthTable(words);
        System.out.println("Word\tLength");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        sc.close();
    }
}
