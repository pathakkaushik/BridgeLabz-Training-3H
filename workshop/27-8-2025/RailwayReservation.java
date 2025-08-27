// import java.util.*;
// public class railway_system {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();
//         int age=sc.nextInt();
//         int tp=sc.nextInt();
//         String tt=sc.next();
//         while(tp>0){
//             if(tp==0){
//                 System.out.println("waiting list");
//             }
//             else{
//                 switch(tt){
//                     case "sleeper":
//                         System.out.println("sleeper ticket booked of"+name);
//                         System.out.println(300);
//                         break;
//                     case "general":
//                         System.out.println("general ticket booked of"+name);
//                         System.out.println(150);
//                         break;
//                     case "ac":
//                         System.out.println("ac ticket booked of"+name);
//                         System.out.println(700);
//                         break;
//                     case "sleeperac":
//                         System.out.println("sleeperac ticket booked of"+name);
//                         System.out.println(1000);
//                         break;
//                     case "economy":
//                         System.out.println("economy ticket booked of"+name);
//                         System.out.println(1300);
//                         break;
//                 }
//             }
//             tp--;
//         }
//     }
// }
import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trainSeats = 0;   // total seats in train
        int fare = 0;         // fare for selected train
        int bookedSeats = 0;  // counter for booked seats
        int waitingList = 0;  // counter for waiting list

        System.out.println("=== Welcome to Railway Reservation System ===");
        System.out.println("Choose your train:");
        System.out.println("1. Express (Seats: 5, Fare: 500)");
        System.out.println("2. Superfast (Seats: 3, Fare: 800)");
        System.out.println("3. Passenger (Seats: 7, Fare: 300)");

        int choice = sc.nextInt();

        // switch-case for train selection
        switch (choice) {
            case 1:
                trainSeats = 5;
                fare = 500;
                System.out.println("You selected Express Train.");
                break;
            case 2:
                trainSeats = 3;
                fare = 800;
                System.out.println("You selected Superfast Train.");
                break;
            case 3:
                trainSeats = 7;
                fare = 300;
                System.out.println("You selected Passenger Train.");
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Passenger Train.");
                trainSeats = 7;
                fare = 300;
        }

        // do-while → at least one attempt
        do {
            System.out.print("\nEnter number of passengers to book: ");
            int n = sc.nextInt();

            // for loop for booking multiple passengers
            for (int i = 1; i <= n; i++) {
                if (bookedSeats < trainSeats) {
                    bookedSeats++;
                    System.out.println("Seat confirmed for Passenger " + i +
                                       " | Seat No: " + bookedSeats +
                                       " | Fare: " + fare);
                } else {
                    waitingList++;
                    System.out.println("Passenger " + i +
                                       " added to Waiting List | WL No: " + waitingList);
                }
            }

            // while loop to stop when train is full
            while (bookedSeats >= trainSeats) {
                System.out.println("\nAll seats are booked! Only waiting list available.");
                break;
            }

            System.out.print("\nDo you want to book more tickets? (yes=1 / no=0): ");
        } while (sc.nextInt() == 1);

        System.out.println("\n=== Reservation Summary ===");
        System.out.println("Seats Booked: " + bookedSeats + "/" + trainSeats);
        System.out.println("Waiting List: " + waitingList);
        System.out.println("Thank you for using Railway Reservation System!");
        
        sc.close();
    }
}
