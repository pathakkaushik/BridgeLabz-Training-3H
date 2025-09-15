package StringFile.level2;

import java.util.Scanner;

public class VowelConsonantCount {

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, cons = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isLetter(c)) {
                if (isVowel(c))
                    vowels++;
                else
                    cons++;
            }
        }
        return new int[] { vowels, cons };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        int[] res = countVowelsConsonants(input);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
        sc.close();
    }
}
