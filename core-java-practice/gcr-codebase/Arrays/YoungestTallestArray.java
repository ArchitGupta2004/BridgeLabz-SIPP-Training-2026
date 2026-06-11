import java.util.Scanner;
public class YoungestTallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }
        
        int minAgeIndex = 0;
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (height[i] > height[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        
        System.out.println("Youngest friend is " + names[minAgeIndex]);
        System.out.println("Tallest friend is " + names[maxHeightIndex]);
        sc.close();
    }
}
