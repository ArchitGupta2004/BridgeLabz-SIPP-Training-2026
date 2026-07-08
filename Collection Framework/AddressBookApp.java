import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBookApp {
    private List<Contact> contactsList = new ArrayList<>();
    private Map<String, Contact> contactsMap = new HashMap<>();
    private Set<String> phoneNumbers = new HashSet<>();

    public void addContact(String name, String phone, String email) {
        if (phoneNumbers.contains(phone)) {
            System.out.println("Error: Contact with phone number " + phone + " already exists.");
            return;
        }
        if (contactsMap.containsKey(name.toLowerCase())) {
            System.out.println("Error: Contact with name " + name + " already exists.");
            return;
        }
        Contact newContact = new Contact(name, phone, email);
        contactsList.add(newContact);
        contactsMap.put(name.toLowerCase(), newContact);
        phoneNumbers.add(phone);
        System.out.println("Contact added successfully: " + name);
    }

    public void searchContact(String name) {
        Contact contact = contactsMap.get(name.toLowerCase());
        if (contact != null) {
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void deleteContact(String name) {
        Contact contact = contactsMap.remove(name.toLowerCase());
        if (contact != null) {
            contactsList.remove(contact);
            phoneNumbers.remove(contact.phone);
            System.out.println("Contact deleted successfully: " + name);
        } else {
            System.out.println("Contact not found for deletion: " + name);
        }
    }

    public void displayContacts() {
        if (contactsList.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }
        Collections.sort(contactsList);
        System.out.println("--- Contacts (Sorted by Name) ---");
        for (Contact contact : contactsList) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Address Book App ===");
        AddressBookApp app = new AddressBookApp();
        app.addContact("Alice", "1234567890", "alice@example.com");
        app.addContact("Bob", "0987654321", "bob@example.com");
        app.addContact("Charlie", "1234567890", "charlie@example.com"); // Duplicate phone
        
        System.out.println();
        app.displayContacts();
        
        System.out.println();
        app.searchContact("Alice");
        
        System.out.println();
        app.deleteContact("Bob");
        
        System.out.println();
        app.displayContacts();
    }
}
