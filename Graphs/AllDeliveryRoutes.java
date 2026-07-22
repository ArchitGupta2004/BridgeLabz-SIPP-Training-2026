import java.util.*;

public class AllDeliveryRoutes {
    static void allRoutes(Map<Integer, List<Integer>> roads, int current, int target, 
                          List<Integer> path, Set<Integer> visited, List<List<Integer>> allRoutes) {
        path.add(current);
        visited.add(current);
        if (current == target) {
            allRoutes.add(new ArrayList<>(path));
        } else {
            for (int next : roads.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(next)) {
                    allRoutes(roads, next, target, path, visited, allRoutes);
                }
            }
        }
        path.remove(path.size() - 1); // backtrack
        visited.remove(current); // backtrack
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 3: All Delivery Routes ===");
        Map<Integer, List<Integer>> roads = new HashMap<>();
        roads.put(1, Arrays.asList(2, 3));
        roads.put(2, Arrays.asList(4));
        roads.put(3, Arrays.asList(4, 5));
        roads.put(4, Arrays.asList(5));
        roads.put(5, new ArrayList<>());

        List<List<Integer>> result = new ArrayList<>();
        allRoutes(roads, 1, 5, new ArrayList<>(), new HashSet<>(), result);
        System.out.println("All routes from 1 to 5:");
        for (List<Integer> route : result) {
            System.out.println(route);
        }
    }
}
