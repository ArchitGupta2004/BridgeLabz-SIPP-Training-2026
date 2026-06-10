import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and power: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int power = sc.nextInt();
            int result = 1;
            int counter = 1;
            while (counter <= power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
