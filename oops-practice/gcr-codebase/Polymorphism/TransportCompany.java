class Vehicle {
    public double fuelCost(int km) {
        return 0;
    }
}
class Car extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 8;
    }
}
class Bus extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 15;
    }
}
class Bike extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 3;
    }
}
class ElectricCar extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 1.5;
    }
}
public class TransportCompany {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };
        int km = 100;
        for (Vehicle v : fleet) {
            if (v instanceof Car) {
                System.out.println("Car Fuel Cost: " + ((Car) v).fuelCost(km));
            } else if (v instanceof Bus) {
                System.out.println("Bus Fuel Cost: " + ((Bus) v).fuelCost(km));
            } else if (v instanceof Bike) {
                System.out.println("Bike Fuel Cost: " + ((Bike) v).fuelCost(km));
            } else if (v instanceof ElectricCar) {
                System.out.println("Electric Car Cost: " + ((ElectricCar) v).fuelCost(km));
            }
        }
    }
}