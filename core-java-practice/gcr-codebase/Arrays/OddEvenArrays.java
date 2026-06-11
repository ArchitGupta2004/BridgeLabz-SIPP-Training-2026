import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Error: Not a natural number.");
                return;
            }
            
            int[] even = new int[number / 2 + 1];
            int[] odd = new int[number / 2 + 1];
            
            int evenIndex = 0;
            int oddIndex = 0;
            
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex] = i;
                    evenIndex++;
                } else {
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }
            
            System.out.print("Odd numbers: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }
            System.out.println();
            
            System.out.print("Even numbers: ");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
