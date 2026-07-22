import java.util.Arrays;

public class HeapSortSensors {
    static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDownMax(arr, i, n);
        }
        for (int end = n - 1; end > 0; end--) {
            int tmp = arr[0]; arr[0] = arr[end]; arr[end] = tmp;
            siftDownMax(arr, 0, end);
        }
    }

    static void siftDownMax(int[] arr, int i, int size) {
        int largest = i;
        int left = 2 * i + 1, right = 2 * i + 2;
        if (left < size && arr[left] > arr[largest]) largest = left;
        if (right < size && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            int tmp = arr[i]; arr[i] = arr[largest]; arr[largest] = tmp;
            siftDownMax(arr, largest, size);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 3: Heap Sort Sensors ===");
        int[] readings = {42, 17, 85, 23, 91, 5};
        System.out.println("Before Sort: " + Arrays.toString(readings));
        heapSort(readings);
        System.out.println("After Sort: " + Arrays.toString(readings));
    }
}
