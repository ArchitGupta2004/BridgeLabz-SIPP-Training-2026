import java.util.*;

class Astronaut {
    String astronautId;
    String name;
    String specialization;

    public Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "ID: " + astronautId + ", Name: " + name + ", Role: " + specialization;
    }
}

public class SpaceMissionManager {
    // Stores mission-wise crew allocation
    private Map<String, List<Astronaut>> missionCrew = new HashMap<>();
    
    // Uses a HashSet to ensure that the same astronaut is not assigned multiple times to the same mission
    private Map<String, Set<String>> missionAstronautIds = new HashMap<>();

    public void addMission(String missionName) {
        missionCrew.putIfAbsent(missionName, new ArrayList<>());
        missionAstronautIds.putIfAbsent(missionName, new HashSet<>());
        System.out.println("Mission added: " + missionName);
    }

    public void assignAstronaut(String missionName, Astronaut astronaut) {
        if (!missionCrew.containsKey(missionName)) {
            System.out.println("Mission " + missionName + " does not exist. Please add it first.");
            return;
        }

        Set<String> assignedIds = missionAstronautIds.get(missionName);
        if (assignedIds.contains(astronaut.astronautId)) {
            System.out.println("Error: Astronaut " + astronaut.name + " (ID: " + astronaut.astronautId + ") is already assigned to mission " + missionName);
        } else {
            missionCrew.get(missionName).add(astronaut);
            assignedIds.add(astronaut.astronautId);
            System.out.println("Successfully assigned " + astronaut.name + " to " + missionName);
        }
    }

    public void displayMissions() {
        System.out.println("=== Space Mission Details ===");
        if (missionCrew.isEmpty()) {
            System.out.println("No missions available.");
            return;
        }
        for (String mission : missionCrew.keySet()) {
            System.out.println("Mission: " + mission);
            List<Astronaut> crew = missionCrew.get(mission);
            if (crew.isEmpty()) {
                System.out.println("  No astronauts assigned.");
            } else {
                for (Astronaut a : crew) {
                    System.out.println("  - " + a);
                }
            }
            System.out.println("Total Crew for " + mission + ": " + crew.size() + "\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Space Mission Crew Management System ===");
        SpaceMissionManager manager = new SpaceMissionManager();
        
        manager.addMission("Apollo 24");
        manager.addMission("Mars Rover V2");
        
        Astronaut a1 = new Astronaut("A101", "John Doe", "Commander");
        Astronaut a2 = new Astronaut("A102", "Jane Smith", "Pilot");
        Astronaut a3 = new Astronaut("A103", "Alice Brown", "Engineer");

        System.out.println();
        manager.assignAstronaut("Apollo 24", a1);
        manager.assignAstronaut("Apollo 24", a2);
        manager.assignAstronaut("Apollo 24", a1); // Duplicate test

        manager.assignAstronaut("Mars Rover V2", a2);
        manager.assignAstronaut("Mars Rover V2", a3);
        
        System.out.println();
        manager.displayMissions();
    }
}
