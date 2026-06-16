import java.util.*;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150 to 250
        }

        System.out.println("Heights: " + Arrays.toString(heights));

        long sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest: " + shortest);
        System.out.println("Tallest: " + tallest);
    }

    public static long findSum(int[] arr) {
        long sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }
}
