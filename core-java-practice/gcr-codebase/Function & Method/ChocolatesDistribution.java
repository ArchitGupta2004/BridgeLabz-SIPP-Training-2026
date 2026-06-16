import java.util.*;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates each child gets: " + result[1]);
        System.out.println("Remaining chocolates: " + result[0]);
    }
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
