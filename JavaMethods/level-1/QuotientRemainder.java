import java.util.*;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and divisor:");
        int n = sc.nextInt(), d = sc.nextInt();
        int[] result = findRemainderAndQuotient(n, d);
        System.out.println("Quotient: " + result[1] + ", Remainder: " + result[0]);
        sc.close();
    }
}
