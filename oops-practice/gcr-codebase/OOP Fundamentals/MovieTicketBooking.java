public class MovieTicketBooking {
    static class MovieTicket {
        String movieName;
        String seatNumber;
        double price;
        boolean isBooked;

        public MovieTicket(String movieName, double price) {
            this.movieName = movieName;
            this.price = price;
            this.seatNumber = "Not Assigned";
            this.isBooked = false;
        }

        public void bookTicket(String seatNumber) {
            if (!isBooked) {
                this.seatNumber = seatNumber;
                this.isBooked = true;
                System.out.println("Ticket booked successfully for seat: " + seatNumber);
            } else {
                System.out.println("Ticket is already booked for seat: " + this.seatNumber);
            }
        }

        public void displayDetails() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
            System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 15.00);
        System.out.println("--- Before Booking ---");
        ticket.displayDetails();
        
        System.out.println("\n--- Booking Action ---");
        ticket.bookTicket("A12");
        
        System.out.println("\n--- After Booking ---");
        ticket.displayDetails();
    }
}
