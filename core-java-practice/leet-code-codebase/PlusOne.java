import java.util.Arrays;
import java.util.Scanner;
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        PlusOne obj = new PlusOne();
        int[] result = obj.plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}