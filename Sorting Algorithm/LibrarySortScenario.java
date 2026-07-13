import java.util.Arrays;
import java.util.Random;

public class LibrarySortScenario {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        
        for (int size : sizes) {
            System.out.println("--- Array Size: " + size + " ---");
            int[] original = generateRandomArray(size, 1900, 2026); // Years
            int[] originalGenres = generateRandomArray(size, 1, 20); // Genre codes 1-20
            
            // Merge Sort
            int[] arr1 = Arrays.copyOf(original, original.length);
            long start1 = System.nanoTime();
            mergeSort(arr1, 0, arr1.length - 1);
            long end1 = System.nanoTime();
            System.out.println("Merge Sort Time (ns): " + (end1 - start1));
            
            // Quick Sort (Lomuto Partition)
            int[] arr2 = Arrays.copyOf(original, original.length);
            long start2 = System.nanoTime();
            quickSort(arr2, 0, arr2.length - 1);
            long end2 = System.nanoTime();
            System.out.println("Quick Sort Time (ns): " + (end2 - start2));
            
            // Counting Sort (Genre codes 1-20)
            int[] arr3 = Arrays.copyOf(originalGenres, originalGenres.length);
            long start3 = System.nanoTime();
            countingSort(arr3, 1, 20);
            long end3 = System.nanoTime();
            System.out.println("Counting Sort Time (ns): " + (end3 - start3));
            System.out.println();
        }
    }

    private static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }
        return arr;
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        System.arraycopy(arr, left, L, 0, n1);
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort with Lomuto Partition
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = lomutoPartition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    // Counting Sort
    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        
        for (int j : arr) {
            count[j - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
