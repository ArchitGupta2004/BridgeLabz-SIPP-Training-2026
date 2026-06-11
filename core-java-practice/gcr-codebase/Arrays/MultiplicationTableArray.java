import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            int[] results = new int[10];
            
            for (int i = 0; i < 10; i++) {
                results[i] = number * (i + 1);
            }
            
            for (int i = 0; i < 10; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + results[i]);
            }
        }
        sc.close();
    }
}
