import java.util.*;

public class SumNaturalCompare {

    public static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int rec = recursiveSum(n);
            int frm = formulaSum(n);
            System.out.println("Recursive Sum = " + rec);
            System.out.println("Formula Sum = " + frm);
            System.out.println(rec == frm ? "Both are equal ✅" : "Not equal ❌");
        }

        sc.close();
    }
}
