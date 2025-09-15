package StringFile.level1;

import java.util.Scanner;

public class ToCharArrayDemo {

    public static char[] myToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length)
            return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] userArr = myToCharArray(text);
        char[] builtInArr = text.toCharArray();

        System.out.println("Comparison result: " + compareCharArrays(userArr, builtInArr));

        sc.close();
    }
}
