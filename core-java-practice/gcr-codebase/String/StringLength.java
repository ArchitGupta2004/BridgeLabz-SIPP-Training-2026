import java.util.Scanner;

public class StringLength {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        int customLen = getLength(text);
        int builtInLen = text.length();
        
        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);
    }
}
