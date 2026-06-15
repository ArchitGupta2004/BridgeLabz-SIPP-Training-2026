import java.util.Scanner;

public class CharFrequencyNested {
    public static String[] getFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        int count = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; // skip duplicates
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as visited
                }
            }
            count++;
        }
        
        String[] result = new String[count];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[idx++] = chars[i] + ": " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        String[] freq = getFrequency(text);
        System.out.println("Character Frequencies:");
        for (String s : freq) {
            System.out.println(s);
        }
    }
}
