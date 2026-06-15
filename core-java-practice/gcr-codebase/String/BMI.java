import java.util.Scanner;

public class BMI {
    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status = "";
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi >= 18.5 && bmi <= 24.9) status = "Normal";
            else if (bmi >= 25.0 && bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.printf("%-10s | %-10s | %-10s | %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %-10s | %-10s | %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        System.out.println("Enter weight(kg) and height(cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i+1) + " Weight: ");
            data[i][0] = sc.nextDouble();
            System.out.print("Member " + (i+1) + " Height: ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = computeBMI(data);
        display(result);
    }
}
