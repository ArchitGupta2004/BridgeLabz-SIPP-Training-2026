class LibraryMember {
    String memberName;
    String memberId;
    public LibraryMember(String name, String id) {
        this.memberName = name;
        this.memberId = id;
    }
    public double calculateFine(int overdueDays) { return 0.0; }
    public void printDetails() {
        System.out.println("ID: " + memberId + ", Name: " + memberName);
    }
}

class StudentMember extends LibraryMember {
    public StudentMember(String name, String id) { super(name, id); }
    @Override
    public double calculateFine(int overdueDays) { return overdueDays * 1.0; } // $1 per day
}

class FacultyMember extends LibraryMember {
    public FacultyMember(String name, String id) { super(name, id); }
    @Override
    public double calculateFine(int overdueDays) { return overdueDays * 0.5; } // $0.5 per day
}

class GuestMember extends LibraryMember {
    public GuestMember(String name, String id) { super(name, id); }
    @Override
    public double calculateFine(int overdueDays) { return overdueDays * 2.0; } // $2 per day
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryMember[] members = {
            new StudentMember("Alice", "S101"),
            new FacultyMember("Dr. Smith", "F201"),
            new GuestMember("Bob", "G301")
        };

        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine for 5 overdue days: $" + m.calculateFine(5));
            System.out.println();
        }
        
        String searchId = "F201";
        System.out.println("Searching for member with ID: " + searchId);
        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("Found -> " + m.memberName);
            }
        }
    }
}
