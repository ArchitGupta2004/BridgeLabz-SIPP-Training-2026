import java.util.Scanner;
public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer below 100: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                    continue;
                }
            }
        }
        sc.close();
    }
}
