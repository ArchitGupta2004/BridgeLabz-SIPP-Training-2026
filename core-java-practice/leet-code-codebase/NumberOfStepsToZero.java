import java.util.Scanner;
public class NumberOfStepsToZero {
    public int numberOfSteps(int n) {
        int step = 0;
        while (n > 0) {
            if (n % 2 == 0)
                n /= 2;
            else
                n--;
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        NumberOfStepsToZero obj = new NumberOfStepsToZero();
        System.out.println("Steps: " + obj.numberOfSteps(n));

    }
}