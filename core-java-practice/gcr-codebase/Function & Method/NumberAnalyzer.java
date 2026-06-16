import java.util.*;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + " is ");
            if (isPositive(numbers[i])) {
                System.out.print("positive");
                if (isEven(numbers[i])) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else {
                System.out.println("negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparing first and last element: ");
        if (comparison == 1) {
            System.out.println("First element is greater.");
        } else if (comparison == -1) {
            System.out.println("First element is less.");
        } else {
            System.out.println("Both elements are equal.");
        }
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }
}
