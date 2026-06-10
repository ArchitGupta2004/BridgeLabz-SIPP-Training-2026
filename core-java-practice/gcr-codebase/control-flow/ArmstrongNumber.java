import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            int sum = 0;
            int originalNumber = number;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += (digit * digit * digit);
                originalNumber /= 10;
            }
            if (sum == number) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not an Armstrong number");
            }
        }
        sc.close();
    }
}
