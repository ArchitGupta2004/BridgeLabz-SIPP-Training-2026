public class CarRentalSystem {
    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double pricePerDay;

        public CarRental(String customerName, String carModel, int rentalDays, double pricePerDay) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
            this.pricePerDay = pricePerDay;
        }

        public double calculateTotalCost() {
            return rentalDays * pricePerDay;
        }

        public void displayDetails() {
            System.out.println("Customer: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Total Cost: $" + calculateTotalCost());
        }
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Charlie", "Toyota Camry", 5, 40.0);
        rental.displayDetails();
    }
}
