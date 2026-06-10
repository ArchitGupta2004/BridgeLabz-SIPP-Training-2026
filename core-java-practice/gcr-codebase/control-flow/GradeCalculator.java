import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter physics marks: ");
        if(sc.hasNextDouble()) {
            double physics = sc.nextDouble();
            System.out.print("Enter chemistry marks: ");
            double chemistry = sc.nextDouble();
            System.out.print("Enter maths marks: ");
            double maths = sc.nextDouble();
            
            double percentage = (physics + chemistry + maths) / 3.0;
            System.out.println("Average Mark / Percentage: " + percentage + "%");
            
            if (percentage >= 80) {
                System.out.println("Grade: A\nRemarks: Level 4, above agency-normalized standards");
            } else if (percentage >= 70) {
                System.out.println("Grade: B\nRemarks: Level 3, at agency-normalized standards");
            } else if (percentage >= 60) {
                System.out.println("Grade: C\nRemarks: Level 2, below, but approaching agency-normalized standards");
            } else if (percentage >= 50) {
                System.out.println("Grade: D\nRemarks: Level 1, well below agency-normalized standards");
            } else if (percentage >= 40) {
                System.out.println("Grade: E\nRemarks: Level 1-, too below agency-normalized standards");
            } else {
                System.out.println("Grade: R\nRemarks: Remedial standards");
            }
        }
        sc.close();
    }
}
