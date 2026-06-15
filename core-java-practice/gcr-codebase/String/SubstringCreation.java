import java.util.Scanner;

public class SubstringCreation {
    public static String createSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid indices.");
            return;
        }

        String customSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);

        boolean areEqual = compareStrings(customSub, builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
