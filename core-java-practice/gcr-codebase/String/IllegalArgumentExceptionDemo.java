import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    public static void generateException(String text) {
        String sub = text.substring(5, 2);
    }
    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException (or equivalent): " + e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.toString());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (at least 6 chars): ");
        String text = scanner.next();
        System.out.println("Handling Exception:");
        handleException(text);
        
        System.out.println("\nGenerating Exception:");
        generateException(text);
    }
}
