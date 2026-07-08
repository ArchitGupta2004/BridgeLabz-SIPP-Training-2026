import java.util.ArrayList;
import java.util.List;

public class SmartParkingManager {
    private List<String> parkedVehicles = new ArrayList<>();

    public void vehicleEnter(String regNumber) {
        if (!parkedVehicles.contains(regNumber)) {
            parkedVehicles.add(regNumber);
            System.out.println("Vehicle " + regNumber + " has entered the parking.");
        } else {
            System.out.println("Vehicle " + regNumber + " is already parked.");
        }
    }

    public void vehicleExit(String regNumber) {
        if (parkedVehicles.remove(regNumber)) {
            System.out.println("Vehicle " + regNumber + " has exited the parking.");
        } else {
            System.out.println("Vehicle " + regNumber + " not found in the parking.");
        }
    }

    public void searchVehicle(String regNumber) {
        if (parkedVehicles.contains(regNumber)) {
            System.out.println("Vehicle " + regNumber + " is currently parked.");
        } else {
            System.out.println("Vehicle " + regNumber + " is NOT currently parked.");
        }
    }

    public void displayParkedVehicles() {
        System.out.println("--- Parked Vehicles ---");
        if (parkedVehicles.isEmpty()) {
            System.out.println("Parking is currently empty.");
        } else {
            for (String regNumber : parkedVehicles) {
                System.out.println(regNumber);
            }
        }
        System.out.println("Total occupied slots: " + parkedVehicles.size());
    }

    public static void main(String[] args) {
        System.out.println("=== Smart Parking Slot Manager ===");
        SmartParkingManager manager = new SmartParkingManager();
        manager.vehicleEnter("MH12AB1234");
        manager.vehicleEnter("KA05XY9876");
        manager.vehicleEnter("MH12AB1234"); // Duplicate enter
        
        System.out.println();
        manager.displayParkedVehicles();
        
        System.out.println();
        manager.searchVehicle("KA05XY9876");
        manager.searchVehicle("DL01YZ5678");
        
        System.out.println();
        manager.vehicleExit("MH12AB1234");
        
        System.out.println();
        manager.displayParkedVehicles();
    }
}
