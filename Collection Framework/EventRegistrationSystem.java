import java.util.HashSet;
import java.util.Set;

public class EventRegistrationSystem {
    private Set<String> registeredEmails = new HashSet<>();

    public void registerParticipant(String email) {
        if (registeredEmails.add(email.toLowerCase())) {
            System.out.println("Registration successful for: " + email);
        } else {
            System.out.println("Registration failed. Email " + email + " is already registered.");
        }
    }

    public void displayParticipants() {
        System.out.println("--- Registered Participants ---");
        if (registeredEmails.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            for (String email : registeredEmails) {
                System.out.println(email);
            }
        }
        System.out.println("Total number of eligible attendees: " + registeredEmails.size());
    }

    public static void main(String[] args) {
        System.out.println("=== Event Entry Verification System ===");
        EventRegistrationSystem system = new EventRegistrationSystem();
        system.registerParticipant("alice@techconf.com");
        system.registerParticipant("bob@techconf.com");
        system.registerParticipant("alice@techconf.com"); // Duplicate
        
        System.out.println();
        system.displayParticipants();
    }
}
