import java.util.Scanner;
public class UsernameValidator {
    public static boolean isValid(String s, int idx) {
        if (idx == s.length()) return true;
        char c = s.charAt(idx);
        if (c < 'a' || c > 'z') return false;
        return isValid(s, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String s = sc.nextLine();
        System.out.println("Output: " + isValid(s, 0));
        sc.close();
    }
}
