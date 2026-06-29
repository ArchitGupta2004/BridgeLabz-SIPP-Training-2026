class VehicleFleet {
    public void fuelCost(double km) {
        System.out.println("Generic vehicle fuel cost calculated.");
    }
}

class CarFleet extends VehicleFleet {
    @Override
    public void fuelCost(double km) {
        System.out.println("Car fuel cost for " + km + " km: $" + (km * 0.1));
    }
}

class BusFleet extends VehicleFleet {
    @Override
    public void fuelCost(double km) {
        System.out.println("Bus fuel cost for " + km + " km: $" + (km * 0.3));
    }
}

class BikeFleet extends VehicleFleet {
    @Override
    public void fuelCost(double km) {
        System.out.println("Bike fuel cost for " + km + " km: $" + (km * 0.05));
    }
}

class ElectricCarFleet extends VehicleFleet {
    @Override
    public void fuelCost(double km) {
        System.out.println("Electric Car fuel cost for " + km + " km: $" + (km * 0.02));
    }
}

public class FleetManagement {
    public static void main(String[] args) {
        VehicleFleet[] fleet = {
            new CarFleet(),
            new BusFleet(),
            new BikeFleet(),
            new ElectricCarFleet()
        };

        for (VehicleFleet v : fleet) {
            v.fuelCost(100.0);
            if (v instanceof ElectricCarFleet) {
                System.out.println("-> This is an Electric Car.");
            } else if (v instanceof CarFleet) {
                System.out.println("-> This is a standard Car.");
            } else if (v instanceof BusFleet) {
                System.out.println("-> This is a Bus.");
            } else if (v instanceof BikeFleet) {
                System.out.println("-> This is a Bike.");
            }
            System.out.println();
        }
    }
}
