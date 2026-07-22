import java.util.*;

public class CircuitWiringLoops {
    static boolean hasWiringLoop(Map<Integer, List<Integer>> circuit, int n) {
        Set<Integer> visited = new HashSet<>();
        for (int v = 0; v < n; v++) {
            if (!visited.contains(v)) {
                if (dfsCycleCheck(circuit, v, -1, visited)) return true;
            }
        }
        return false;
    }

    static boolean dfsCycleCheck(Map<Integer, List<Integer>> circuit, int node, int parent, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : circuit.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                if (dfsCycleCheck(circuit, neighbor, node, visited)) return true;
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 5: Circuit Wiring Loops ===");
        Map<Integer, List<Integer>> circuit = new HashMap<>();
        circuit.put(0, Arrays.asList(1));
        circuit.put(1, Arrays.asList(0, 2));
        circuit.put(2, Arrays.asList(1, 3));
        circuit.put(3, Arrays.asList(2, 0)); // creates a loop 0-1-2-3-0
        
        System.out.println("Has wiring loop (cycle)? " + hasWiringLoop(circuit, 4));

        Map<Integer, List<Integer>> circuitNoLoop = new HashMap<>();
        circuitNoLoop.put(0, Arrays.asList(1));
        circuitNoLoop.put(1, Arrays.asList(0, 2));
        circuitNoLoop.put(2, Arrays.asList(1, 3));
        circuitNoLoop.put(3, Arrays.asList(2)); 

        System.out.println("Has wiring loop (no cycle)? " + hasWiringLoop(circuitNoLoop, 4));
    }
}
