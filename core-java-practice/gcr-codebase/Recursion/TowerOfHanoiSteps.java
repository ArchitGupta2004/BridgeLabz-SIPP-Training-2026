import java.util.Scanner;
public class TowerOfHanoiSteps {
    public static void hanoi(int n, char source, char dest, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
            return;
        }
        hanoi(n - 1, source, aux, dest);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        hanoi(n - 1, aux, dest, source);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Output:");
        hanoi(n, 'A', 'C', 'B');
        sc.close();
    }
}
