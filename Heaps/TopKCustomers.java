import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class TopKCustomers {
    static List<Integer> topKLargest(int[] transactions, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int amount : transactions) {
            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }
        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 4: Top-K Largest Customers ===");
        int[] transactions = {100, 500, 200, 900, 50, 800};
        System.out.println("Transactions: " + Arrays.toString(transactions));
        System.out.println("Top 3 Transactions: " + topKLargest(transactions, 3));
    }
}
