import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void generateException(String[] names) {
        String name = names[names.length + 1];
    }

    public static void handleException(String[] names) {
        try {
            String name = names[names.length + 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        System.out.println("Handling Exception:");
        handleException(names);

        System.out.println("\nGenerating Exception:");
        generateException(names);
    }
}
