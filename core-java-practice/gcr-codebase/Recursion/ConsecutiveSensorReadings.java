import java.util.Scanner;
public class ConsecutiveSensorReadings {
    public static boolean isIncreasing(int[] arr, int idx) {
        if (idx >= arr.length - 1) return true;
        if (arr[idx] >= arr[idx + 1]) return false;
        return isIncreasing(arr, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of readings: ");
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println("Output: true");
            return;
        }
        int[] arr = new int[n];
        System.out.print("Enter readings: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Output: " + isIncreasing(arr, 0));
        sc.close();
    }
}
