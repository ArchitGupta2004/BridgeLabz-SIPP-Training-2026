import java.util.*;
public class ReverseInteger {
    public int reverse(int x) {
        long n = 0;
        int original = x;
        while (x != 0) {
            int lastDigit = x % 10;
            n += lastDigit;
            n = n * 10;
            x = x / 10;
        }
        n = n / 10;
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }
        if (original < 0) {
            return (int) (-1 * n);
        }
        return (int) n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        ReverseInteger obj = new ReverseInteger();
        System.out.println("Reversed Integer: " + obj.reverse(x));

    }
}