import java.util.*;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Remainder: " + result[0]);
        System.out.println("Quotient: " + result[1]);
    }
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
