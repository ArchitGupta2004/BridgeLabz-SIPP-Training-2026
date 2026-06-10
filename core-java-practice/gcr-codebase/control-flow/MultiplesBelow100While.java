import java.util.Scanner;
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer below 100: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int counter = 100 - 1;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
        sc.close();
    }
}
