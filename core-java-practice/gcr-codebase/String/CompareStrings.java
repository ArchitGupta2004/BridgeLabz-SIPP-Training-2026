import java.util.Scanner;

public class CompareStrings {
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean customResult = compareUsingCharAt(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Result using custom method (charAt): " + customResult);
        System.out.println("Result using built-in method (equals): " + builtInResult);
        
        if (customResult == builtInResult) {
            System.out.println("Both methods yield the same result.");
        } else {
            System.out.println("Results differ.");
        }
    }
}
