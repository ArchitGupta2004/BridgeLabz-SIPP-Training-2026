import java.util.Arrays;

public class EmployeeIdInsertionSort {
    public static void main(String[] args) {
        int[] empIds = {105, 102, 104, 101, 103};
        System.out.println("Unsorted Employee IDs: " + Arrays.toString(empIds));
        insertionSort(empIds);
        System.out.println("Sorted Employee IDs (Ascending): " + Arrays.toString(empIds));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
