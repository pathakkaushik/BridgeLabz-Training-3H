package StringFile.level3;

import java.util.Scanner;

public class DeckOfCards {

    // Suits and Ranks
    static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace" };

    // Initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Distribute the cards
    public static String[][] distributeCards(String[] deck, int numPlayers, int numCardsEach) {
        if (numPlayers * numCardsEach > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numPlayers][numCardsEach];
        int index = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCardsEach; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Print players and their cards
    public static void printPlayers(String[][] players) {
        if (players == null)
            return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " has:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input players and cards
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numCardsEach = sc.nextInt();

        // Step 1: Initialize
        String[] deck = initializeDeck();

        // Step 2: Shuffle
        shuffleDeck(deck);

        // Step 3: Distribute
        String[][] players = distributeCards(deck, numPlayers, numCardsEach);

        // Step 4: Print
        printPlayers(players);

        sc.close();
    }
}
