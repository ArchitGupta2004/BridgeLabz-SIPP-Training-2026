import java.util.*;

public class FactorsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        
        long sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        double sumOfSquares = sumOfSquareOfFactors(factors);
        
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of square of factors: " + sumOfSquares);
    }
    
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    
    public static long sumOfFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    public static double sumOfSquareOfFactors(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}
