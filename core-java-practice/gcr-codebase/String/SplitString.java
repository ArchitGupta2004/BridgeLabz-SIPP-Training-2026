import java.util.Scanner;
import java.util.Arrays;

public class SplitString {
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
        int len = getLength(text);
        if (len == 0) return new String[0];
        
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        
        int[] spaceIndices = new int[spaces];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[idx++] = i;
            }
        }
        
        String[] words = new String[spaces + 1];
        int wordIdx = 0;
        int start = 0;
        
        for (int i = 0; i < spaceIndices.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < spaceIndices[i]; j++) {
                sb.append(text.charAt(j));
            }
            words[wordIdx++] = sb.toString();
            start = spaceIndices[i] + 1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int j = start; j < len; j++) {
            sb.append(text.charAt(j));
        }
        words[wordIdx] = sb.toString();
        
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] customSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");
        
        System.out.println("Custom split: " + Arrays.toString(customSplit));
        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));
        System.out.println("Are they equal? " + compareArrays(customSplit, builtInSplit));
    }
}
