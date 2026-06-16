import java.util.*;

public class SumOfNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        
        long sumRecursive = findSumRecursive(n);
        long sumFormula = findSumFormula(n);
        
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations are correct and match.");
        } else {
            System.out.println("Computations do not match.");
        }
    }
    
    public static long findSumRecursive(int n) {
        if (n == 1) return 1;
        return n + findSumRecursive(n - 1);
    }
    
    public static long findSumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
}
