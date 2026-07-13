import java.util.Arrays;

public class ProductPricesBubbleSort {
    public static void main(String[] args) {
        int[] prices1 = {450, 120, 780, 300, 250, 600};
        System.out.println("Example 1 Input: " + Arrays.toString(prices1));
        System.out.println("Example 1 Output: " + Arrays.toString(bubbleSort(prices1)));

        System.out.println();

        int[] prices2 = {850, 320, 150, 720, 400};
        System.out.println("Example 2 Input: " + Arrays.toString(prices2));
        System.out.println("Example 2 Output: " + Arrays.toString(bubbleSort(prices2)));
    }

    public static int[] bubbleSort(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return prices;
    }
}
