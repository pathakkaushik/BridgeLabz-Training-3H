package StringFile.level2;

import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] choices = { "rock", "paper", "scissors" };
        return choices[(int) (Math.random() * 3)];
    }

    public static int findWinner(String user, String comp) {
        if (user.equals(comp))
            return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            int res = findWinner(user, comp);
            if (res == 1) {
                userWins++;
                System.out.println("You win!");
            } else if (res == -1) {
                compWins++;
                System.out.println("Computer wins!");
            } else
                System.out.println("Draw!");
            System.out.println("Computer chose: " + comp);
        }
        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (100.0 * userWins / games));
        System.out.println("Computer Win %: " + (100.0 * compWins / games));
        sc.close();
    }
}
