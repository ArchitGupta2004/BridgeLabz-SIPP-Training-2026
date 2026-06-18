import java.util.Scanner;
public class DeckOfCards {
    public static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards]; 
        int k = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[k++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int nCards, int xPlayers) {
        if (nCards * xPlayers > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        String[][] players = new String[xPlayers][nCards];
        int cardIdx = 0;
        for (int i = 0; i < xPlayers; i++) {
            for (int j = 0; j < nCards; j++) {
                players[i][j] = deck[cardIdx++];
            }
        }
        return players;
    }
    public static void printPlayers(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int xPlayers = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int nCards = sc.nextInt();
        String[] deck = initDeck();
        shuffleDeck(deck);
        String[][] distributed = distributeCards(deck, nCards, xPlayers);
        printPlayers(distributed);
    }
}
