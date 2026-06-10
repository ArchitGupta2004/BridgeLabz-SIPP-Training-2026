import java.util.Scanner;
public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and power: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int power = sc.nextInt();
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
