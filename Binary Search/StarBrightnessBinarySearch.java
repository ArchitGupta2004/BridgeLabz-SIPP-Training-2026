public class StarBrightnessBinarySearch {
    public static void main(String[] args) {
        System.out.println("--- Star Brightness Scenarios ---");
        
        // 1. Regular Binary Search
        int[] sortedStars = {1, 3, 5, 7, 9, 11, 15, 18, 21};
        int target = 11;
        System.out.println("Target " + target + " found at index: " + binarySearch(sortedStars, target));
        
        // 2. Search in rotated catalog & find minimum
        int[] rotatedStars = {15, 18, 21, 1, 3, 5, 7, 9, 11};
        System.out.println("Minimum element in rotated array is: " + findMinimum(rotatedStars));
        System.out.println("Target " + target + " in rotated array found at index: " + searchRotated(rotatedStars, target));
        
        // 3. Find first and last occurrence
        int[] repeatedStars = {2, 4, 4, 4, 4, 6, 8, 10};
        int searchTarget = 4;
        int[] bounds = findFirstAndLast(repeatedStars, searchTarget);
        System.out.println("First and last occurrence of " + searchTarget + ": [" + bounds[0] + ", " + bounds[1] + "]");
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    
    public static int findMinimum(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
    
    public static int searchRotated(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            
            if (arr[left] <= arr[mid]) { // left half is sorted
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // right half is sorted
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    
    public static int[] findFirstAndLast(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(arr, target, true);
        if (result[0] != -1) {
            result[1] = findBound(arr, target, false);
        }
        return result;
    }
    
    private static int findBound(int[] arr, int target, boolean isFirst) {
        int left = 0, right = arr.length - 1;
        int bound = -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1; // Keep searching left for the first occurrence
                } else {
                    left = mid + 1; // Keep searching right for the last occurrence
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
