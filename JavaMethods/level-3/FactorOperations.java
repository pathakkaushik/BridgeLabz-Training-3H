import java.util.*;

public class FactorOperations {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors[idx++] = i;
        return factors;
    }

    public static int greatestFactor(int[] f) {
        int max = f[0];
        for (int x : f)
            if (x > max)
                max = x;
        return max;
    }

    public static int sumOfFactors(int[] f) {
        int sum = 0;
        for (int x : f)
            sum += x;
        return sum;
    }

    public static int productOfFactors(int[] f) {
        int prod = 1;
        for (int x : f)
            prod *= x;
        return prod;
    }

    public static double productOfCubes(int[] f) {
        double prod = 1;
        for (int x : f)
            prod *= Math.pow(x, 3);
        return prod;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] f = findFactors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest Factor: " + greatestFactor(f));
        System.out.println("Sum: " + sumOfFactors(f));
        System.out.println("Product: " + productOfFactors(f));
        System.out.println("Product of Cubes: " + productOfCubes(f));
    }
}
