import java.util.Scanner;

public class PalindromeCheck {
    public static boolean checkLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkLogic2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkLogic2(text, start + 1, end - 1);
    }

    public static boolean checkLogic3(String text) {
        char[] chars = text.toCharArray();
        char[] rev = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            rev[i] = chars[chars.length - 1 - i];
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != rev[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        System.out.println("Logic 1 (Loop): " + checkLogic1(text));
        System.out.println("Logic 2 (Recursion): " + checkLogic2(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Array Reverse): " + checkLogic3(text));
    }
}
