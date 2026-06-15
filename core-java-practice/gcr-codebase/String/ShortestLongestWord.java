import java.util.Scanner;

public class ShortestLongestWord {
    public static int getLength(String text) {
        return text.length();
    }

    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordLengths) {
        if (wordLengths.length == 0) return new String[]{"", ""};
        
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int minLen = Integer.parseInt(wordLengths[0][1]);
        int maxLen = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordLengths[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = splitWords(text);
        String[][] wordLengths = getWordsAndLengths(words);
        String[] result = findShortestAndLongest(wordLengths);
        
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
