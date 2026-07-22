import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestAdmission {
    static int findKthLargest(int[] scores, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int score : scores) {
            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 5: Kth Largest Admission Score ===");
        int[] scores = {85, 92, 78, 90, 88};
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("2nd Largest Score: " + findKthLargest(scores, 2));
    }
}
