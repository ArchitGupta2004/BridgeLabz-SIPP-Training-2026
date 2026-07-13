import java.util.Arrays;

public class MovieRatingsSelectionSort {
    public static void main(String[] args) {
        int[] ratings1 = {8, 5, 9, 7, 6, 10};
        System.out.println("Example 1 Input: " + Arrays.toString(ratings1));
        System.out.println("Example 1 Output: " + Arrays.toString(selectionSort(ratings1)));

        System.out.println();

        int[] ratings2 = {7, 4, 9, 3, 8};
        System.out.println("Example 2 Input: " + Arrays.toString(ratings2));
        System.out.println("Example 2 Output: " + Arrays.toString(selectionSort(ratings2)));
    }

    public static int[] selectionSort(int[] ratings) {
        int n = ratings.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = ratings[minIdx];
            ratings[minIdx] = ratings[i];
            ratings[i] = temp;
        }
        return ratings;
    }
}
