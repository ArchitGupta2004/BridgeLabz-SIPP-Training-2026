import java.util.Scanner;
public class MathWizard {
    int var = 100;
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public double factorial(double num) {
        double fact = 1;
        for (int i = 1; i <= (int) num; i++) {
            fact *= i;
        }
        return fact;
    }

    public int fibonacci(int num) {
        if (num <= 1) return num;
        int a = 0, b = 1;
        for (int i = 2; i <= num; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    public void showScope() {
        int localVar = 50;
        System.out.println("Local Variable = " + localVar);
        System.out.println("Instance Variable = " + var);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathWizard obj = new MathWizard();
        System.out.print("Enter a number for Prime Check: ");
        int primeNum = sc.nextInt();
        System.out.print("Enter a number for Factorial: ");
        int factNum = sc.nextInt();
        System.out.print("Enter a number for Fibonacci: ");
        int fibNum = sc.nextInt();
        System.out.print("Enter first number for GCD and LCM: ");
        int a = sc.nextInt();
        System.out.print("Enter second number for GCD and LCM: ");
        int b = sc.nextInt();
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.println("Is Prime: " + obj.isPrime(primeNum));
        System.out.println("Factorial: " + obj.factorial(factNum));
        System.out.println("Fibonacci: " + obj.fibonacci(fibNum));
        System.out.println("GCD: " + obj.gcd(a, b));
        System.out.println("LCM: " + obj.lcm(a, b));
        System.out.println("Power: " + obj.power(base, exp));

        obj.showScope();

        sc.close();
    }
}