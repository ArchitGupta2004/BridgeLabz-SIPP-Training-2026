abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public void setPatientId(int id) { this.patientId = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    private double roomCharges;
    private double treatmentCharges;

    public InPatient(int id, String name, int age, double room, double treatment) {
        super(id, name, age);
        this.roomCharges = room;
        this.treatmentCharges = treatment;
    }

    public double getRoomCharges() { return roomCharges; }
    public void setRoomCharges(double charges) { this.roomCharges = charges; }
    
    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double charges) { this.treatmentCharges = charges; }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {
    private double consultationFees;
    private double treatmentCharges;

    public OutPatient(int id, String name, int age, double consult, double treatment) {
        super(id, name, age);
        this.consultationFees = consult;
        this.treatmentCharges = treatment;
    }

    public double getConsultationFees() { return consultationFees; }
    public void setConsultationFees(double fees) { this.consultationFees = fees; }
    
    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double charges) { this.treatmentCharges = charges; }

    @Override
    public double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient(1, "John Smith", 45, 2000.0, 5000.0);
        OutPatient outPatient = new OutPatient(2, "Jane Doe", 30, 500.0, 1000.0);

        inPatient.displayPatientDetails();
        System.out.println("InPatient Total Bill: $" + inPatient.calculateBill() + "\n");

        outPatient.displayPatientDetails();
        System.out.println("OutPatient Total Bill: $" + outPatient.calculateBill() + "\n");
    }
}
