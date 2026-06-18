import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {
    public static void generateException(String text) {
        char c = text.charAt(text.length() + 1); // Generates StringIndexOutOfBoundsException
    }
    public static void handleException(String text) {
        try {
            char c = text.charAt(text.length() + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.toString());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.println("Handling Exception:");
        handleException(text);
        System.out.println("\nGenerating Exception:");
        generateException(text);
    }
}
