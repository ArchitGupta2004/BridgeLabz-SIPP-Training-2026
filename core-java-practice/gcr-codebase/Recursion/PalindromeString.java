import java.util.Scanner;
public class PalindromeString {
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left + 1, right - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        if(isPalindrome(s, 0, s.length() - 1)) {
            System.out.println("Output: Palindrome");
        } else {
            System.out.println("Output: Not Palindrome");
        }
        sc.close();
    }
}
