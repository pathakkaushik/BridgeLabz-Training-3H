import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int age1 = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int h1 = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int age2 = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int h2 = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int age3 = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int h3 = sc.nextInt();

        // Youngest
        if (age1 < age2 && age1 < age3)
            System.out.println("Amar is youngest");
        else if (age2 < age3)
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");

        // Tallest
        if (h1 > h2 && h1 > h3)
            System.out.println("Amar is tallest");
        else if (h2 > h3)
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");
    }
}