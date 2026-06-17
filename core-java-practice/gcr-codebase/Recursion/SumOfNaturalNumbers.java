import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sum(int n) {
        if (n <= 1) return n;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Output: " + sum(n));
        sc.close();
    }
}
