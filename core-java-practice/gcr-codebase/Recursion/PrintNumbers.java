import java.util.Scanner;
public class PrintNumbers {
    public static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Output: ");
        printNto1(n);
        System.out.println();
        sc.close();
    }
}
