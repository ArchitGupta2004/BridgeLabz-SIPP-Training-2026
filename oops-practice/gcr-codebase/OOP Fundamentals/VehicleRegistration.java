public class VehicleRegistration {
    static class Vehicle {
        String ownerName;
        String vehicleType;
        static double registrationFee = 50.0;

        public Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        public void displayVehicleDetails() {
            System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Fee: $" + registrationFee);
        }

        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Sedan");
        Vehicle v2 = new Vehicle("Bob", "SUV");

        v1.displayVehicleDetails();
        
        System.out.println("\nUpdating Registration Fee to $75.0...\n");
        Vehicle.updateRegistrationFee(75.0);
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
