import java.util.Arrays;

public class InsertionSortArray {
    public static void main(String[] args) {
        int[] nums1 = {12, 11, 13, 5, 6};
        System.out.println("Example 1 Input: " + Arrays.toString(nums1));
        System.out.println("Example 1 Output: " + Arrays.toString(insertionSort(nums1)));

        System.out.println();

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Example 2 Input: " + Arrays.toString(nums2));
        System.out.println("Example 2 Output: " + Arrays.toString(insertionSort(nums2)));
    }

    public static int[] insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
}
