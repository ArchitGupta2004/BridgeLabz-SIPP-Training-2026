interface Trackable {
    void logActivity();
    default void resetData() {
        System.out.println("Trackable: Data reset successfully.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    @Override
    public void logActivity() {
        System.out.println("Logging daily steps and heart rate...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating weekly fitness report...");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: You've reached your daily step goal!");
    }
}

public class FitnessTrackerSystem {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();
        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}
