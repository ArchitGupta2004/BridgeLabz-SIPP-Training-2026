import java.util.Scanner;
public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        if (sc.hasNextInt()) {
            int start = sc.nextInt();
            for (int counter = start; counter >= 1; counter--) {
                System.out.println(counter);
            }
        }
        sc.close();
    }
}
