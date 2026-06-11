import java.util.Scanner;
public class DigitFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = Math.abs(sc.nextLong());
        
        long temp = number;
        int count = 0;
        if (temp == 0) count = 1;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        
        int[] digits = new int[count];
        temp = number;
        if (temp == 0) digits[0] = 0;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }
        
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        sc.close();
    }
}
