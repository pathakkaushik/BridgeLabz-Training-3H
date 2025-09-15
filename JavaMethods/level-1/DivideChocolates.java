import java.util.*;

public class DivideChocolates {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of chocolates and children:");
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[1] + ", Remaining: " + result[0]);
        sc.close();
    }
}
