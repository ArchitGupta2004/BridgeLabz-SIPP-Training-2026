import java.util.Scanner;

public class ConvertToUppercase {
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result.append(c);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a complete text: ");
        String text = scanner.nextLine();

        String customUpper = toUpperCaseCustom(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        boolean areEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Are the results equal? " + areEqual);
    }
}
