import java.util.Scanner;
import java.util.Arrays;

public class CharactersInString {
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] customChars = getCharacters(text);
        char[] builtInChars = text.toCharArray();

        System.out.println("Custom character array: " + Arrays.toString(customChars));
        System.out.println("Built-in character array: " + Arrays.toString(builtInChars));

        boolean result = compareArrays(customChars, builtInChars);
        System.out.println("Are both arrays equal? " + result);
    }
}
