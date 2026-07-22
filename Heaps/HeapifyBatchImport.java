import java.util.Arrays;

public class HeapifyBatchImport {
    static void buildHeap(int[] priorities) {
        int n = priorities.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDownMin(priorities, i, n);
        }
    }

    static void siftDownMin(int[] arr, int i, int size) {
        int smallest = i;
        int left = 2 * i + 1, right = 2 * i + 2;
        if (left < size && arr[left] < arr[smallest]) smallest = left;
        if (right < size && arr[right] < arr[smallest]) smallest = right;
        if (smallest != i) {
            int tmp = arr[i]; arr[i] = arr[smallest]; arr[smallest] = tmp;
            siftDownMin(arr, smallest, size);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 2: Heapify Batch Import ===");
        int[] priorities = {10, 20, 15, 30, 40};
        System.out.println("Before Heapify: " + Arrays.toString(priorities));
        buildHeap(priorities);
        System.out.println("After Heapify (Min-Heap): " + Arrays.toString(priorities));
    }
}
