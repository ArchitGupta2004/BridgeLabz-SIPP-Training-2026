import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();
        }
        
        calculateBMI(teamData);
        String[] statuses = determineBMIStatus(teamData);
        
        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }
    }
    
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeter = data[i][1] / 100;
            data[i][2] = weight / (heightInMeter * heightInMeter);
        }
    }
    
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
