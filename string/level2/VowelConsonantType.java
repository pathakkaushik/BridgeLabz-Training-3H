package StringFile.level2;

import java.util.Scanner;

public class VowelConsonantType {

    public static String getType(char c) {
        if (!Character.isLetter(c))
            return "Not a Letter";
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vowel" : "Consonant";
    }

    public static String[][] analyze(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = getType(str.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        String[][] res = analyze(input);
        System.out.println("Char\tType");
        for (String[] row : res)
            System.out.println(row[0] + "\t" + row[1]);
        sc.close();
    }
}
