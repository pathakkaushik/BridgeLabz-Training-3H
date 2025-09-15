import java.util.*;

public class NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuck(int num) {
        int[] d = getDigits(num);
        for (int x : d)
            if (x == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] d = getDigits(num);
        int n = d.length, sum = 0;
        for (int x : d)
            sum += Math.pow(x, n);
        return sum == num;
    }

    public static int[] findLargestSecondLargest(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2)
                max2 = x;
        }
        return new int[] { max1, max2 };
    }

    public static int[] findSmallestSecondSmallest(int[] d) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2)
                min2 = x;
        }
        return new int[] { min1, min2 };
    }

    public static int sumOfDigits(int[] d) {
        int sum = 0;
        for (int x : d)
            sum += x;
        return sum;
    }

    public static int sumOfSquares(int[] d) {
        int sum = 0;
        for (int x : d)
            sum += Math.pow(x, 2);
        return sum;
    }

    public static boolean isHarshad(int num) {
        int[] d = getDigits(num);
        int sum = sumOfDigits(d);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int num) {
        int[] freq = new int[10];
        int[] d = getDigits(num);
        for (int x : d)
            freq[x]++;
        int[][] res = new int[10][2];
        for (int i = 0; i < 10; i++) {
            res[i][0] = i;
            res[i][1] = freq[i];
        }
        return res;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int num) {
        int[] d = getDigits(num);
        return arraysEqual(d, reverseArray(d));
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int sq = num * num;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int[] d = getDigits(num);
        int sum = 0, prod = 1;
        for (int x : d) {
            sum += x;
            prod *= x;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int num) {
        String n = String.valueOf(num);
        String sq = String.valueOf(num * num);
        return sq.endsWith(n);
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++)
                fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 153; // test number
        System.out.println("Armstrong: " + isArmstrong(num));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Prime: " + isPrime(num));
    }
}
