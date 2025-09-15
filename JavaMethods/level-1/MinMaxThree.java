import java.util.*;

public class MinMaxThree {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        sc.close();
    }
}
