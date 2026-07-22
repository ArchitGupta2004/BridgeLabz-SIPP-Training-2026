import java.util.*;

public class NetworkIsolatedSegments {
    static int countNetworkSegments(Map<Integer, List<Integer>> network, int n) {
        Set<Integer> visited = new HashSet<>();
        int segments = 0;
        for (int server = 0; server < n; server++) {
            if (!visited.contains(server)) {
                segments++;
                dfsMark(network, server, visited);
            }
        }
        return segments; // == 1 means fully connected
    }

    static void dfsMark(Map<Integer, List<Integer>> network, int node, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : network.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) dfsMark(network, neighbor, visited);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 4: Network Isolated Segments ===");
        Map<Integer, List<Integer>> network = new HashMap<>();
        network.put(0, Arrays.asList(1, 2));
        network.put(1, Arrays.asList(0, 2));
        network.put(2, Arrays.asList(0, 1));
        network.put(3, Arrays.asList(4));
        network.put(4, Arrays.asList(3));

        int n = 5; // 0 to 4
        System.out.println("Number of segments in a 5-node network: " + countNetworkSegments(network, n));
    }
}
