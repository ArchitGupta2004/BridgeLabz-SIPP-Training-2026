import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] getStats(int userWins, int compWins, int total) {
        double userAvg = (double) userWins / total;
        double compAvg = (double) compWins / total;
        double userPerc = userAvg * 100;
        double compPerc = compAvg * 100;

        String[][] stats = {
            {"User", String.valueOf(userWins), String.format("%.2f", userAvg), String.format("%.2f%%", userPerc)},
            {"Computer", String.valueOf(compWins), String.format("%.2f", compAvg), String.format("%.2f%%", compPerc)}
        };
        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.printf("%-10s | %-5s | %-10s | %-10s\n", "Player", "Wins", "Average", "Percentage");
        System.out.println("---------------------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-10s | %-5s | %-10s | %-10s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);
            
            System.out.println("Computer chose: " + compChoice + " -> Winner: " + winner);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = getStats(userWins, compWins, games);
        displayStats(stats);
    }
}
