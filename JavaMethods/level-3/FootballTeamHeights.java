import java.util.Arrays;

public class FootballTeamHeights {

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr)
            sum += n;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int n : arr)
            if (n < min)
                min = n;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            if (n > max)
                max = n;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150-250
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}
