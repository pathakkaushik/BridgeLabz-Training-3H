import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinear using slope formula
    public static boolean areCollinearBySlope(double x1, double y1,
            double x2, double y2,
            double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinear using area of triangle formula
    public static boolean areCollinearByArea(double x1, double y1,
            double x2, double y2,
            double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates of point B (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Enter coordinates of point C (x3 y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by slope method: " + collinearSlope);
        System.out.println("Collinear by area method: " + collinearArea);

        sc.close();
    }
}
