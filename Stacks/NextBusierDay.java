import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextBusierDay {
    public static int[] nextBusierDay(int[] visitors) {
        int n = visitors.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Deque<Integer> stack = new ArrayDeque<>(); 
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {
                answer[stack.pop()] = visitors[i];
            }
            stack.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Scenario 4: Next Greater Element — Next Higher-Traffic Day");
        int[] visitors = {50, 40, 30, 60, 70, 65, 80};
        System.out.println("Daily visitors: " + Arrays.toString(visitors));
        int[] result = nextBusierDay(visitors);
        System.out.println("Next busier days: " + Arrays.toString(result));
    }
}
