class RescueTeam {
    String teamId;
    String location;
    public RescueTeam(String id, String loc) {
        this.teamId = id;
        this.location = loc;
    }
    public void performDuty() { System.out.println("Generic rescue duty."); }
}

class MedicalTeam extends RescueTeam {
    public MedicalTeam(String id, String loc) { super(id, loc); }
    @Override
    public void performDuty() { System.out.println("Providing first aid and medical care."); }
}

class FireRescueTeam extends RescueTeam {
    public FireRescueTeam(String id, String loc) { super(id, loc); }
    @Override
    public void performDuty() { System.out.println("Extinguishing fires and evacuating people."); }
}

class FoodSupplyTeam extends RescueTeam {
    public FoodSupplyTeam(String id, String loc) { super(id, loc); }
    @Override
    public void performDuty() { System.out.println("Distributing food and clean water."); }
}

public class RescueManagement {
    static void findTeamByLocation(RescueTeam[] teams, String loc) {
        System.out.println("Teams at " + loc + ":");
        for (RescueTeam t : teams) {
            if (t.location.equalsIgnoreCase(loc)) {
                System.out.println(" - " + t.teamId + " (" + t.getClass().getSimpleName() + ")");
            }
        }
    }

    static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
        System.out.println("\nTeams with prefix '" + prefix + "':");
        for (RescueTeam t : teams) {
            if (t.teamId.startsWith(prefix)) {
                System.out.println(" - " + t.teamId);
            }
        }
    }

    public static void main(String[] args) {
        RescueTeam[] teams = {
            new MedicalTeam("MED-01", "Sector 4"),
            new FireRescueTeam("FIRE-01", "Sector 4"),
            new FoodSupplyTeam("FOOD-01", "Sector 5"),
            new MedicalTeam("MED-02", "Sector 9")
        };

        findTeamByLocation(teams, "Sector 4");
        displayTeamsByPrefix(teams, "MED");

        System.out.println("\n--- Performing Duties ---");
        int medCount = 0, fireCount = 0, foodCount = 0;

        for (RescueTeam t : teams) {
            t.performDuty();
            if (t instanceof MedicalTeam) medCount++;
            else if (t instanceof FireRescueTeam) fireCount++;
            else if (t instanceof FoodSupplyTeam) foodCount++;
        }

        System.out.println("\nDeployment Stats: Medical=" + medCount + ", Fire=" + fireCount + ", Food=" + foodCount);
        
        String maxCategory = "Medical";
        int maxCount = medCount;
        if (fireCount > maxCount) { maxCount = fireCount; maxCategory = "FireRescue"; }
        if (foodCount > maxCount) { maxCount = foodCount; maxCategory = "FoodSupply"; }
        
        System.out.println("Category with max deployments: " + maxCategory + " (" + maxCount + ")");
    }
}
