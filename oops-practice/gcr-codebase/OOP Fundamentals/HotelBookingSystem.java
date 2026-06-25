public class HotelBookingSystem {
    static class HotelBooking {
        String guestName;
        String roomType;
        int nights;

        public HotelBooking() {
            this.guestName = "Guest";
            this.roomType = "Standard";
            this.nights = 1;
        }

        public HotelBooking(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        public HotelBooking(HotelBooking other) {
            this.guestName = other.guestName;
            this.roomType = other.roomType;
            this.nights = other.nights;
        }

        public void displayBooking() {
            System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
        }
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Bob", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);

        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();
    }
}
