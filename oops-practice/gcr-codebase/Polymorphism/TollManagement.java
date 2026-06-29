class VehicleToll {
    String vehicleNumber;
    String ownerName;
    public VehicleToll(String number, String name) {
        this.vehicleNumber = number;
        this.ownerName = name;
    }
    public double calculateToll() { return 0.0; }
}

class CarToll extends VehicleToll {
    public CarToll(String num, String name) { super(num, name); }
    @Override
    public double calculateToll() { return 50.0; }
}

class BusToll extends VehicleToll {
    public BusToll(String num, String name) { super(num, name); }
    @Override
    public double calculateToll() { return 150.0; }
}

class TruckToll extends VehicleToll {
    public TruckToll(String num, String name) { super(num, name); }
    @Override
    public double calculateToll() { return 250.0; }
}

public class TollManagement {
    static double calculateTotalRevenue(VehicleToll[] vehicles) {
        double total = 0;
        for (VehicleToll v : vehicles) {
            total += v.calculateToll();
        }
        return total;
    }

    static void searchVehicle(VehicleToll[] vehicles, String num) {
        for (VehicleToll v : vehicles) {
            if (v.vehicleNumber.equals(num)) {
                System.out.println("Found vehicle: " + v.ownerName + " (" + v.getClass().getSimpleName() + ")");
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public static void main(String[] args) {
        VehicleToll[] traffic = {
            new CarToll("CAR-123", "Alice"),
            new BusToll("BUS-456", "Transport Co"),
            new TruckToll("TRK-789", "Logistics Inc"),
            new CarToll("CAR-999", "Bob")
        };

        System.out.println("Total Revenue: $" + calculateTotalRevenue(traffic));
        searchVehicle(traffic, "BUS-456");

        VehicleToll highest = traffic[0];
        int carCount = 0, busCount = 0, truckCount = 0;

        for (VehicleToll v : traffic) {
            if (v.calculateToll() > highest.calculateToll()) {
                highest = v;
            }
            if (v instanceof CarToll) carCount++;
            else if (v instanceof BusToll) busCount++;
            else if (v instanceof TruckToll) truckCount++;
        }

        System.out.println("\nVehicle paying highest toll: " + highest.vehicleNumber + " paying $" + highest.calculateToll());
        System.out.println("Cars: " + carCount + ", Buses: " + busCount + ", Trucks: " + truckCount);
    }
}
