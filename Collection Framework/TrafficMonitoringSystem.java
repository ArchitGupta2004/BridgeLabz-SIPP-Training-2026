import java.util.*;

public class TrafficMonitoringSystem {
    // HashMap to store road name as Key and number of vehicles as Value
    private Map<String, Integer> roadTraffic = new HashMap<>();

    public void recordVehicles(String roadName, int count) {
        roadTraffic.put(roadName, roadTraffic.getOrDefault(roadName, 0) + count);
        System.out.println("Recorded " + count + " vehicles on " + roadName + ". Total: " + roadTraffic.get(roadName));
    }

    public void displaySortedTraffic() {
        System.out.println("--- Traffic Report (Sorted by Road Name) ---");
        // TreeMap to display all roads in sorted order based on their names
        TreeMap<String, Integer> sortedRoads = new TreeMap<>(roadTraffic);
        for (Map.Entry<String, Integer> entry : sortedRoads.entrySet()) {
            System.out.println("Road: " + entry.getKey() + ", Vehicles: " + entry.getValue());
        }
    }

    public void identifyBusiestRoad() {
        if (roadTraffic.isEmpty()) {
            System.out.println("No traffic data recorded.");
            return;
        }
        
        String busiestRoad = null;
        int maxVehicles = -1;
        
        for (Map.Entry<String, Integer> entry : roadTraffic.entrySet()) {
            if (entry.getValue() > maxVehicles) {
                maxVehicles = entry.getValue();
                busiestRoad = entry.getKey();
            }
        }
        System.out.println("Busiest Road: " + busiestRoad + " with " + maxVehicles + " vehicles.");
    }

    public void generateReport() {
        System.out.println("=== Comprehensive Traffic Analysis Report ===");
        if (roadTraffic.isEmpty()) {
            System.out.println("No data to display.");
            return;
        }
        
        displaySortedTraffic();
        System.out.println();
        identifyBusiestRoad();
        System.out.println();
        System.out.println("Total number of roads being monitored: " + roadTraffic.size());
        System.out.println("=============================================");
    }

    public static void main(String[] args) {
        System.out.println("=== Smart City Traffic Monitoring System ===");
        TrafficMonitoringSystem system = new TrafficMonitoringSystem();
        system.recordVehicles("Main Street", 500);
        system.recordVehicles("Broadway", 1200);
        system.recordVehicles("5th Avenue", 850);
        system.recordVehicles("Main Street", 300); // update test
        
        System.out.println();
        system.generateReport();
    }
}
