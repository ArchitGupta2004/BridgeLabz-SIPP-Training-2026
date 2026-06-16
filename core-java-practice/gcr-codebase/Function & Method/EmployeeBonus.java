import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] data = generateEmployeeData();
        double[][] newSalaryData = calculateNewSalaryAndBonus(data);
        displayTabularFormat(data, newSalaryData);
    }

    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int) (Math.random() * 15) + 1; // 1 to 15 years of service
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] newSalaryData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonusPct = years > 5 ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPct;
            newSalaryData[i][0] = oldSalary + bonusAmount; // New Salary
            newSalaryData[i][1] = bonusAmount; // Bonus Amount
        }
        return newSalaryData;
    }

    public static void displayTabularFormat(double[][] oldData, double[][] newData) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", 
                (i + 1), oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
            sumOld += oldData[i][0];
            sumNew += newData[i][0];
            sumBonus += newData[i][1];
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t%.2f\t%.2f\n", sumOld, sumNew, sumBonus);
    }
}
