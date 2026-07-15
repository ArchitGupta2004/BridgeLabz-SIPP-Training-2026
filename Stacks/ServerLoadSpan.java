import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ServerLoadSpan {
    public static int[] loadSpan(int[] load) {
        int n = load.length;
        int[] span = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); 
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && load[stack.peek()] <= load[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        System.out.println("Scenario 5: Stock Span — Server Load Span for Anomaly Detection");
        int[] load = {10, 20, 15, 30, 25, 40};
        System.out.println("Server Loads: " + Arrays.toString(load));
        int[] spans = loadSpan(load);
        System.out.println("Load Spans: " + Arrays.toString(spans));
    }
}
