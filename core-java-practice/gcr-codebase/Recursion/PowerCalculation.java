import java.util.Scanner;
public class PowerCalculation {
    public static long power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Output: " + power(x, n));
        sc.close();
    }
}
