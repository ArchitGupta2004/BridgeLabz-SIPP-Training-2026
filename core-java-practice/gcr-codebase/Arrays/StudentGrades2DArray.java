import java.util.Scanner;
public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        
        double[][] marks = new double[numStudents][3];
        double[] percentage = new double[numStudents];
        char[] grade = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics marks: ");
            marks[i][0] = sc.nextDouble();
            System.out.print("Chemistry marks: ");
            marks[i][1] = sc.nextDouble();
            System.out.print("Maths marks: ");
            marks[i][2] = sc.nextDouble();
            
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Marks cannot be negative. Enter positive values.");
                i--;
                continue;
            }
            
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        
        System.out.println("\n--- Student Grades (2D Array) ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + ", Chemistry=" + marks[i][1] + ", Maths=" + marks[i][2] + ", Percentage=" + percentage[i] + "%, Grade=" + grade[i]);
        }
        sc.close();
    }
}
