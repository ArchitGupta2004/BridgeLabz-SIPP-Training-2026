import java.util.Arrays;

public class SportsMeet {
    public static void main(String[] args) {
        int[] scores1 = {64, 25, 12, 22, 11};
        System.out.println("--- Bubble Sort Trace ---");
        bubbleSort(scores1);
        
        System.out.println("\n--- Insertion Sort Trace ---");
        int[] scores2 = {64, 25, 12, 22, 11};
        insertionSort(scores2);
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        boolean isSorted = true; // To check best case
        
        System.out.println("Initial array: " + Arrays.toString(arr));
        
        for (int i = 0; i < n - 1; i++) {
            boolean swappedThisPass = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Ascending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swappedThisPass = true;
                    isSorted = false;
                }
            }
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
            if (!swappedThisPass) {
                break;
            }
        }
        
        if (isSorted) {
            System.out.println("The array was already sorted (Best Case).");
        }
        System.out.println("Total swaps: " + swaps);
        printTopMedalists(arr);
    }
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int shifts = 0;
        boolean isSorted = true;
        
        System.out.println("Initial array: " + Arrays.toString(arr));
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            boolean shiftedThisPass = false;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                shifts++;
                shiftedThisPass = true;
                isSorted = false;
            }
            arr[j + 1] = key;
            
            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
        
        if (isSorted) {
            System.out.println("The array was already sorted (Best Case).");
        }
        System.out.println("Total shifts: " + shifts);
        printTopMedalists(arr);
    }

    private static void printTopMedalists(int[] arr) {
        System.out.print("Top 3 Medalists (Highest scores): ");
        int count = 0;
        for (int i = arr.length - 1; i >= 0 && count < 3; i--) {
            System.out.print(arr[i] + (count < 2 && i > 0 ? ", " : ""));
            count++;
        }
        System.out.println();
    }
}
