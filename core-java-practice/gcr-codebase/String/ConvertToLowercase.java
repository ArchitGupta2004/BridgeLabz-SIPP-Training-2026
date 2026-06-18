import java.util.Scanner;
public class ConvertToLowercase {
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
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
        String customLower = toLowerCaseCustom(text);
        String builtInLower = text.toLowerCase();
        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);

        boolean areEqual = compareStrings(customLower, builtInLower);
        System.out.println("Are the results equal? " + areEqual);
    }
}
