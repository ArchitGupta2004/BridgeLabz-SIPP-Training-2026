import java.util.Scanner;

public class CharFrequencyUnique {
    public static char[] getUniqueChars(String text) {
        char[] temp = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[count++] = c;
            }
        }
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) unique[i] = temp[i];
        return unique;
    }

    public static String[][] getFrequency(String text) {
        char[] unique = getUniqueChars(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            char uChar = unique[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uChar) {
                    count++;
                }
            }
            result[i][0] = String.valueOf(uChar);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        String[][] freq = getFrequency(text);
        System.out.println("Character Frequencies:");
        for (String[] row : freq) {
            System.out.println("'" + row[0] + "': " + row[1]);
        }
    }
}
