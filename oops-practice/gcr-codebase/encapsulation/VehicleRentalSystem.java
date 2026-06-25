abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String number) { this.vehicleNumber = number; }
    
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String type) { this.vehicleType = type; }

    public abstract double calculateRentalCost(int days);
    
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + " | Type: " + vehicleType);
    }
}

class Car extends Vehicle {
    private double dailyRate;

    public Car(String num, double rate) {
        super(num, "Car");
        this.dailyRate = rate;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double rate) { this.dailyRate = rate; }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {
    private double dailyRate;

    public Bike(String num, double rate) {
        super(num, "Bike");
        this.dailyRate = rate;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double rate) { this.dailyRate = rate; }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    public Truck(String num, double rate, double charge) {
        super(num, "Truck");
        this.dailyRate = rate;
        this.loadingCharge = charge;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double rate) { this.dailyRate = rate; }
    
    public double getLoadingCharge() { return loadingCharge; }
    public void setLoadingCharge(double charge) { this.loadingCharge = charge; }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("CA-1234", 45.0);
        Bike bike = new Bike("BK-5678", 15.0);
        Truck truck = new Truck("TR-9012", 80.0, 100.0);
        
        int days = 3;

        car.displayVehicleDetails();
        System.out.println("Rental Cost for " + days + " days: $" + car.calculateRentalCost(days));
        
        System.out.println();
        bike.displayVehicleDetails();
        System.out.println("Rental Cost for " + days + " days: $" + bike.calculateRentalCost(days));
        
        System.out.println();
        truck.displayVehicleDetails();
        System.out.println("Rental Cost for " + days + " days: $" + truck.calculateRentalCost(days));
    }
}
