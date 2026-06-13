import java.util.*;
public class Spyagency {
    public static String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }
    public static boolean isPalindrome(String message) {
        String cleaned = message.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
    public static void countVowelsAndConsonants(String message) {
        int vowels = 0, consonants = 0;
        for (char ch : message.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static char firstNonRepeatingCharacter(String log) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : log.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : log.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter secret message: ");
        String message = sc.nextLine();
        System.out.println("Reversed Message: " + reverseMessage(message));
        System.out.println("Is Palindrome: " + isPalindrome(message));

        countVowelsAndConsonants(message);
        System.out.print("Enter first intercepted message: ");
        String intercept1 = sc.nextLine();
        System.out.print("Enter second intercepted message: ");
        String intercept2 = sc.nextLine();
        System.out.println("Are Anagrams: " + areAnagrams(intercept1, intercept2));
        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();
        char result = firstNonRepeatingCharacter(log);
        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
        sc.close();
    }
}