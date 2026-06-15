import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text that is not a number: ");
        String text = scanner.next();

        System.out.println("Handling Exception:");
        handleException(text);
        
        System.out.println("\nGenerating Exception:");
        generateException(text);
    }
}
