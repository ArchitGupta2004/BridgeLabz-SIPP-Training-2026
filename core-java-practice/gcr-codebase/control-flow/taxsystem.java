import java.util.*;
public class taxsystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of Citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\n--- Tax Details ---");

        for (int i = 0; i < 10; i++) {
            double tax;

            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                System.out.println("Citizen " + (i + 1) +
                                   " -> 5% Tax Bracket, Tax = " + tax);
            } else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                System.out.println("Citizen " + (i + 1) +
                                   " -> 15% Tax Bracket, Tax = " + tax);
            } else {
                tax = incomes[i] * 0.30;
                System.out.println("Citizen " + (i + 1) +
                                   " -> 30% Tax Bracket, Tax = " + tax);
            }

            totalTax += tax;
        }

        System.out.println("\nTotal Tax Collected = " + totalTax);

      
    }
}