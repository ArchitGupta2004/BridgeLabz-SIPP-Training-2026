import java.util.Scanner;
public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        String s = sc.nextLine();
        System.out.println("Output: " + reverse(s));
        sc.close();
    }
}
