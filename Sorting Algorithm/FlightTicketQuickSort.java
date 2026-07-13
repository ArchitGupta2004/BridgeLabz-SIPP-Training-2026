import java.util.Arrays;

public class FlightTicketQuickSort {
    public static void main(String[] args) {
        int n = 5;
        int[] prices = {4500, 2200, 3800, 1800, 5200};
        System.out.println("Input Prices: " + Arrays.toString(prices));
        quickSort(prices, 0, n - 1);
        System.out.println("Sorted Prices: " + Arrays.toString(prices));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
