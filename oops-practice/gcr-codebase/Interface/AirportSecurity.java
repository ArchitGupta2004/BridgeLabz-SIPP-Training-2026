interface LuggageScanner {
    void scanLuggage();
    default void displaySecurityGuidelines() {
        System.out.println("Guidelines: Luggage must not contain sharp objects or liquids over 100ml.");
    }
}

interface PassportVerifier {
    void verifyPassport();
    default void displaySecurityGuidelines() {
        System.out.println("Guidelines: Passport must be valid and not expired.");
    }
    static boolean isPassportNumberValid(String passportNo) {
        return passportNo != null && passportNo.matches("^[A-Z]{1}[0-9]{7}$");
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {
    @Override
    public void scanLuggage() {
        System.out.println("Scanning luggage for dangerous items...");
    }

    @Override
    public void verifyPassport() {
        System.out.println("Verifying passport identity...");
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
    
    public boolean canBoard(String passportNo) {
        return PassportVerifier.isPassportNumberValid(passportNo);
    }
}

public class AirportSecurity {
    public static void main(String[] args) {
        AirportSecuritySystem system = new AirportSecuritySystem();
        system.displaySecurityGuidelines();
        
        String[] passengers = {"A1234567", "invalid123", "B9876543"};
        for (String p : passengers) {
            System.out.println("Checking passenger with passport: " + p);
            system.verifyPassport();
            system.scanLuggage();
            if (system.canBoard(p)) {
                System.out.println("-> Passenger cleared to board.");
            } else {
                System.out.println("-> Passenger DENIED boarding.");
            }
            System.out.println();
        }
    }
}
