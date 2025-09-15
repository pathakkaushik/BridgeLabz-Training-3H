import java.util.*;

public class TriangularPark {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle (in meters):");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Rounds to complete 5km: " + calculateRounds(a, b, c));
        sc.close();
    }
}
