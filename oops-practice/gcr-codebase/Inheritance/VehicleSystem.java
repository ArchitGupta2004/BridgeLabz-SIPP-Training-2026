class Vehicle {
    double maxSpeed;
    String model;
    public Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150.0, "Tesla Model 3");
        ev.charge();
        
        PetrolVehicle pv = new PetrolVehicle(180.0, "Honda Civic");
        pv.refuel();
    }
}
