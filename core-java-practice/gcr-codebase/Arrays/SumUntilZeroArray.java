import java.util.Scanner;

public class SumUntilZeroArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter numbers (0 or negative to stop, max 10): ");
        while (true) {
            if (index == 10) {
                break;
            }
            if(sc.hasNextDouble()) {
                double entry = sc.nextDouble();
                if (entry <= 0) {
                    break;
                }
                numbers[index] = entry;
                index++;
            } else {
                break;
            }
        }
        
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total sum: " + total);
        sc.close();
    }
}
