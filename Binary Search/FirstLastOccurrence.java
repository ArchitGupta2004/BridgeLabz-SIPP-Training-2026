import java.util.Arrays;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int target2 = 6;
        
        System.out.println("Occurrences of " + target1 + ": " + Arrays.toString(searchRange(arr, target1)));
        System.out.println("Occurrences of " + target2 + ": " + Arrays.toString(searchRange(arr, target2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(nums, target, true);
        if (result[0] != -1) {
            result[1] = findBound(nums, target, false);
        }
        return result;
    }
    
    private static int findBound(int[] arr, int target, boolean isFirst) {
        int left = 0, right = arr.length - 1;
        int bound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return bound;
    }
}
