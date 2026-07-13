public class RotationPoint {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotation point (minimum element) of arr1: " + findRotationPoint(arr1));
        
        int[] arr2 = {11, 13, 15, 17};
        System.out.println("Rotation point (minimum element) of arr2: " + findRotationPoint(arr2));
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
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
}
