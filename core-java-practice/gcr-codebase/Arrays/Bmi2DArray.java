import java.util.Scanner;
public class Bmi2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            
            if (personData[i][0] < 0 || personData[i][1] < 0) {
                System.out.println("Values cannot be negative. Enter positive values.");
                i--;
                continue;
            }
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if (personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][1] + "m, Weight: " + personData[i][0] + "kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
        sc.close();
    }
}
