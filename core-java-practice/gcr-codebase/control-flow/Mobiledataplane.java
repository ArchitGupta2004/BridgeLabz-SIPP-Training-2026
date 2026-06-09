
import java.util.*;
public class Mobiledataplane {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] usage = new double[10];
        double totalRevenue = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter data usage (GB) of Customer " + (i + 1) + ": ");
            usage[i] = sc.nextDouble();
        }
        System.out.println("\n--- Customer Bills ---");

        for (int i = 0; i < 10; i++) {
            double bill;
            if (usage[i] < 5) {
                bill = usage[i] * 100;
                System.out.println("Customer " + (i + 1) +" -> Basic Plan, Bill = " + bill);
            } else if (usage[i] <= 20) {
                bill = usage[i] * 80;
                System.out.println("Customer " + (i + 1) + " -> Standard Plan, Bill = " + bill);
            } else {
                bill = usage[i] * 60;
                System.out.println("Customer " + (i + 1) + " -> Premium Plan, Bill = " + bill);
            }

            totalRevenue += bill;
        }
        System.out.println("\nTotal Revenue Collected = ₹" + totalRevenue);
    }
}
