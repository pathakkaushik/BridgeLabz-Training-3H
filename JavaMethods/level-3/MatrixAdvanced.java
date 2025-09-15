import java.util.*;

public class MatrixAdvanced {

    public static double[][] createRandomMatrix(int n) {
        Random rand = new Random();
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = rand.nextInt(10); // 0-9
        return matrix;
    }

    public static double[][] transpose(double[][] M) {
        int n = M.length;
        double[][] T = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                T[j][i] = M[i][j];
        return T;
    }

    public static double determinant(double[][] M) {
        int n = M.length;
        if (n == 1)
            return M[0][0];
        if (n == 2)
            return M[0][0] * M[1][1] - M[0][1] * M[1][0];

        double det = 0;
        for (int col = 0; col < n; col++) {
            double[][] sub = new double[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int subCol = 0;
                for (int j = 0; j < n; j++) {
                    if (j == col)
                        continue;
                    sub[i - 1][subCol++] = M[i][j];
                }
            }
            det += Math.pow(-1, col) * M[0][col] * determinant(sub);
        }
        return det;
    }

    public static double[][] inverse(double[][] M) {
        int n = M.length;
        double det = determinant(M);
        if (det == 0)
            return null;

        double[][] adj = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double[][] sub = new double[n - 1][n - 1];
                int r = 0;
                for (int x = 0; x < n; x++) {
                    if (x == i)
                        continue;
                    int c = 0;
                    for (int y = 0; y < n; y++) {
                        if (y == j)
                            continue;
                        sub[r][c++] = M[x][y];
                    }
                    r++;
                }
                adj[j][i] = Math.pow(-1, i + j) * determinant(sub);
            }
        }
        double[][] inv = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                inv[i][j] = adj[i][j] / det;
        return inv;
    }

    public static void print(double[][] M) {
        for (double[] row : M) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        double[][] M = createRandomMatrix(n);
        System.out.println("\nMatrix:");
        print(M);

        System.out.println("\nTranspose:");
        print(transpose(M));

        System.out.println("\nDeterminant: " + determinant(M));

        double[][] inv = inverse(M);
        if (inv == null)
            System.out.println("\nInverse does not exist (det = 0)");
        else {
            System.out.println("\nInverse:");
            print(inv);
        }
        sc.close();
    }
}
