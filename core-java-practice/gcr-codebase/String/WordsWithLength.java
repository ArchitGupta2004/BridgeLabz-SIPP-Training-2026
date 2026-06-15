import java.util.Scanner;

public class WordsWithLength {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        if (text.isEmpty()) return new String[0];
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        String[] words = new String[spaces + 1];
        int wordIdx = 0, start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIdx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIdx] = text.substring(start);
        return words;
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = splitWords(text);
        String[][] wordLengths = getWordsAndLengths(words);
        
        System.out.printf("%-15s | %-10s\n", "Word", "Length");
        System.out.println("----------------------------");
        for (String[] row : wordLengths) {
            int len = Integer.parseInt(row[1]);
            System.out.printf("%-15s | %-10d\n", row[0], len);
        }
    }
}
