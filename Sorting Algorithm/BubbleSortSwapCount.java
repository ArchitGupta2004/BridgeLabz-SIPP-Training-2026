import java.util.Arrays;

public class BubbleSortSwapCount {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 1};
        System.out.println("Example 1 Input: " + Arrays.toString(nums1));
        System.out.println("Example 1 Output: " + countSwaps(nums1));

        System.out.println();

        int[] nums2 = {1, 2, 3};
        System.out.println("Example 2 Input: " + Arrays.toString(nums2));
        System.out.println("Example 2 Output: " + countSwaps(nums2));
    }

    public static int countSwaps(int[] nums) {
        int n = nums.length;
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return swaps;
    }
}
