package StringFile.level3;

import java.util.Scanner;

public class CalendarDisplay {

    // Month names
    static String[] months = {
            "", "January", "February", "March",
            "April", "May", "June", "July",
            "August", "September", "October",
            "November", "December"
    };

    // Number of days in each month
    static int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Check leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Get number of days in a month
    public static int getDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Zeller’s congruence algorithm for first day of month
    public static int getFirstDayOfMonth(int year, int month, int day) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Print the calendar
    public static void printCalendar(int year, int month) {
        System.out.println("   " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(year, month, 1);
        int days = getDaysInMonth(year, month);

        // Print spaces for the first line
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(year, month);

        sc.close();
    }
}
