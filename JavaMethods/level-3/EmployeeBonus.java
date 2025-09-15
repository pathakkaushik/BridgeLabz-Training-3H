import java.util.Random;

public class EmployeeBonus {

    // Method to generate salary (5-digit) and years of service for 10 employees
    public static double[][] generateEmployeeData(int size) {
        Random rand = new Random();
        double[][] data = new double[size][2]; // [salary, yearsOfService]
        for (int i = 0; i < size; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(15); // 1 to 15 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate new salary and bonus for each employee
    public static double[][] calculateBonus(double[][] empData) {
        double[][] result = new double[empData.length][2]; // [newSalary, bonus]
        for (int i = 0; i < empData.length; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to display table and calculate totals
    public static void displayTable(double[][] empData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-12s %-12s %-12s %-12s %-12s\n",
                "No", "Old Salary", "Years", "Bonus", "New Salary", " ");

        for (int i = 0; i < empData.length; i++) {
            totalOld += empData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%-5d %-12.2f %-12.0f %-12.2f %-12.2f\n",
                    (i + 1), empData[i][0], empData[i][1],
                    newData[i][1], newData[i][0]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOld);
        System.out.printf("Total New Salary: %.2f\n", totalNew);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        double[][] empData = generateEmployeeData(10);
        double[][] newData = calculateBonus(empData);
        displayTable(empData, newData);
    }
}
