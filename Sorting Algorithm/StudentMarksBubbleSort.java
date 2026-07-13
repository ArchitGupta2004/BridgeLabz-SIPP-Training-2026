import java.util.Arrays;

public class StudentMarksBubbleSort {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 90, 88};
        System.out.println("Unsorted Marks: " + Arrays.toString(marks));
        bubbleSort(marks);
        System.out.println("Sorted Marks (Ascending): " + Arrays.toString(marks));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
