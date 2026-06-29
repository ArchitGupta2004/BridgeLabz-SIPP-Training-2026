interface HeartRateMonitor {
    void monitorHeartRate();
    default void displayHealthTips() {
        System.out.println("Health Tip: Do regular cardio exercises to maintain a healthy heart rate.");
    }
    static boolean isPatientIdValid(String patientId) {
        return patientId != null && patientId.startsWith("PT-") && patientId.length() == 7;
    }
}

interface TemperatureMonitor {
    void monitorTemperature();
    default void displayHealthTips() {
        System.out.println("Health Tip: Stay hydrated to maintain normal body temperature.");
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    @Override
    public void monitorHeartRate() {
        System.out.println("Reading heart rate (BPM)...");
    }

    @Override
    public void monitorTemperature() {
        System.out.println("Reading body temperature (°C)...");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }
}

public class HealthcareMonitoring {
    public static void main(String[] args) {
        HealthMonitoringSystem system = new HealthMonitoringSystem();
        system.displayHealthTips();
        System.out.println("--------------------------------");
        
        String[] patientNames = {"Alice", "Bob", "Charlie"};
        String[] patientIds = {"PT-1001", "1234", "PT-1002"};
        
        for (int i = 0; i < patientNames.length; i++) {
            System.out.println("Patient: " + patientNames[i] + " (ID: " + patientIds[i] + ")");
            if (HeartRateMonitor.isPatientIdValid(patientIds[i])) {
                system.monitorHeartRate();
                system.monitorTemperature();
                System.out.println("-> Final Report: Vitals are normal.");
            } else {
                System.out.println("-> Error: Invalid Patient ID. Cannot generate report.");
            }
            System.out.println();
        }
    }
}
