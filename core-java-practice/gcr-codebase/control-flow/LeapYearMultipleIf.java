import java.util.Scanner;
public class LeapYearMultipleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        if(sc.hasNextInt()) {
            int year = sc.nextInt();
            if (year >= 1582) {
                boolean isLeap = false;
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            isLeap = true;
                        } else {
                            isLeap = false;
                        }
                    } else {
                        isLeap = true;
                    }
                } else {
                    isLeap = false;
                }
                if (isLeap) {
                    System.out.println("The Year is a Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Year must be >= 1582");
            }
        }
        sc.close();
    }
}
