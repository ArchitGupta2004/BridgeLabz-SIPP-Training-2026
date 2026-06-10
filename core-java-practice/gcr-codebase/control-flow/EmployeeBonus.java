import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        if (sc.hasNextDouble()) {
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            if (sc.hasNextInt()) {
                int years = sc.nextInt();
                if (years > 5) {
                    double bonus = salary * 0.05;
                    System.out.println("Bonus amount: " + bonus);
                } else {
                    System.out.println("No bonus.");
                }
            }
        }
        sc.close();
    }
}
