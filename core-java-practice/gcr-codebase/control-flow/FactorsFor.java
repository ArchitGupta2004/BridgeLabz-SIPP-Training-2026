import java.util.Scanner;
public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
