import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileWriter fw = new FileWriter("expenses.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            System.out.println("Enter expense (e.g. Food - 200) or 'stop':");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("stop")) break;
                pw.println(input);
            }
            System.out.println("Expense saved.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
