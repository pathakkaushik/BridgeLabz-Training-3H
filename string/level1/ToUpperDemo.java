package StringFile.level1;

import java.util.Scanner;

public class ToUpperDemo {

    public static String myToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String myUpper = myToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("User-defined uppercase: " + myUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Are they equal? " + compareStrings(myUpper, builtInUpper));

        sc.close();
    }
}
