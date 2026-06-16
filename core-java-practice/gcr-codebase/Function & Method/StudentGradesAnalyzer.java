import java.util.*;

public class StudentGradesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        double total = physics + chemistry + maths;
        double average = total / 3;
        double percentage = (total / 300) * 100;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");

        String grade = getGrade(percentage);
        System.out.println("Grade: " + grade);
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }
}
