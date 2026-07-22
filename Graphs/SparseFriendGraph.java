import java.util.*;

public class SparseFriendGraph {
    Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    void addFriendship(int u, int v) {
        friendGraph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        friendGraph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    boolean isFriend(int u, int v) {
        return friendGraph.getOrDefault(u, Collections.emptySet()).contains(v);
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 1: Sparse Friend Graph ===");
        SparseFriendGraph graph = new SparseFriendGraph();
        graph.addFriendship(1, 2);
        graph.addFriendship(1, 3);
        System.out.println("Is 1 and 2 friends? " + graph.isFriend(1, 2)); // true
        System.out.println("Is 2 and 3 friends? " + graph.isFriend(2, 3)); // false
    }
}
