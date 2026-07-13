public class PeakElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        System.out.println("Peak element index in arr1: " + findPeakElement(arr1));
        
        int[] arr2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak element index in arr2: " + findPeakElement(arr2));
    }

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int left = 1, right = n - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
