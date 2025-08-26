import java.util.Scanner;
class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0, i = 1;
            while(i <= n) { sumLoop += i; i++; }
            System.out.println("Formula sum: " + sumFormula);
            System.out.println("Loop sum: " + sumLoop);
            System.out.println("Results match? " + (sumFormula == sumLoop));
        } else {
            System.out.println("Not a natural number");
 }
}
}