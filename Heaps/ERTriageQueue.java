import java.util.PriorityQueue;
class Patient {
    String name;
    int severity;
    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    @Override
    public String toString() {
        return name + "(Severity: " + severity + ")";
    }
}

public class ERTriageQueue {
    PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> b.severity - a.severity);

    void addPatient(Patient p) {
        triageQueue.offer(p);
    }

    Patient treatNext() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {
        System.out.println("=== Scenario 1: ER Triage Queue ===");
        ERTriageQueue er = new ERTriageQueue();
        er.addPatient(new Patient("Alice", 3));
        er.addPatient(new Patient("Bob", 5));
        er.addPatient(new Patient("Charlie", 1));
        System.out.println("Treating: " + er.treatNext()); // Bob
        System.out.println("Treating: " + er.treatNext()); // Alice
    }
}
