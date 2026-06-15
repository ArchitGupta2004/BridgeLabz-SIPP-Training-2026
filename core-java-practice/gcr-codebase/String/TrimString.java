import java.util.Scanner;

public class TrimString {
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text with leading/trailing spaces:");
        String text = scanner.nextLine();
        
        int[] indices = findTrimIndices(text);
        String customTrim = createSubstring(text, indices[0], indices[1]);
        String builtInTrim = text.trim();
        
        System.out.println("Custom Trimmed: '" + customTrim + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrim + "'");
        System.out.println("Are they equal? " + compareStrings(customTrim, builtInTrim));
    }
}
