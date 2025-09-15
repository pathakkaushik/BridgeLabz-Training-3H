package StringFile.level2;

import java.util.Scanner;

public class TrimSubstringCompare {

    public static int[] trimIndexes(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ')
            start++;
        while (end >= start && str.charAt(end) == ' ')
            end--;
        return new int[] { start, end + 1 };
    }

    public static String substringCustom(String str, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++)
            res += str.charAt(i);
        return res;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String input = sc.nextLine();
        int[] idx = trimIndexes(input);
        String trimmedCustom = substringCustom(input, idx[0], idx[1]);
        String trimmedBuiltin = input.trim();
        System.out.println("Custom Trim: [" + trimmedCustom + "]");
        System.out.println("Built-in Trim: [" + trimmedBuiltin + "]");
        System.out.println("Same? " + compareStrings(trimmedCustom, trimmedBuiltin));
        sc.close();
    }
}
