import java.util.Scanner;
public class StudentGradesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentage = new double[numStudents];
        char[] grade = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics marks: ");
            physics[i] = sc.nextDouble();
            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextDouble();
            System.out.print("Maths marks: ");
            maths[i] = sc.nextDouble();
            
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative. Enter positive values.");
                i--;
                continue;
            }
            
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        
        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + physics[i] + ", Chemistry=" + chemistry[i] + ", Maths=" + maths[i] + ", Percentage=" + percentage[i] + "%, Grade=" + grade[i]);
        }
        sc.close();
    }
}
