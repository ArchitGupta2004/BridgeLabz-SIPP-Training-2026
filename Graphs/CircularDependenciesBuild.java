import java.util.*;

public class CircularDependenciesBuild {
    static boolean hasCircularDependency(Map<Integer, List<Integer>> tasks, int n) {
        int[] state = new int[n]; // 0 = WHITE, 1 = GRAY, 2 = BLACK
        for (int v = 0; v < n; v++) {
            if (state[v] == 0) {
                if (dfsCycleCheck(tasks, v, state)) return true;
            }
        }
        return false;
    }

    static boolean dfsCycleCheck(Map<Integer, List<Integer>> tasks, int node, int[] state) {
        state[node] = 1; // GRAY
        for (int dep : tasks.getOrDefault(node, Collections.emptyList())) {
            if (state[dep] == 1) return true;
            if (state[dep] == 0 && dfsCycleCheck(tasks, dep, state)) return true;
        }
        state[node] = 2; // BLACK
        return false;
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 6: Circular Dependencies in Build ===");
        Map<Integer, List<Integer>> tasks = new HashMap<>();
        tasks.put(0, Arrays.asList(1));
        tasks.put(1, Arrays.asList(2));
        tasks.put(2, Arrays.asList(0)); // 0->1->2->0

        System.out.println("Has circular dependency (cycle)? " + hasCircularDependency(tasks, 3));

        Map<Integer, List<Integer>> validTasks = new HashMap<>();
        validTasks.put(0, Arrays.asList(1, 2));
        validTasks.put(1, Arrays.asList(2));
        
        System.out.println("Has circular dependency (no cycle)? " + hasCircularDependency(validTasks, 3));
    }
}
