import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendanceTracker {
    private Map<String, ArrayList<String>> attendanceMap = new HashMap<>();

    public void markAttendance(String subject, String studentName) {
        attendanceMap.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> students = attendanceMap.get(subject);
        
        if (!students.contains(studentName)) {
            students.add(studentName);
            System.out.println("Attendance marked for " + studentName + " in " + subject);
        } else {
            System.out.println(studentName + " is already marked present for " + subject);
        }
    }

    public void displayAttendanceForSubject(String subject) {
        System.out.println("--- Attendance for " + subject + " ---");
        List<String> students = attendanceMap.getOrDefault(subject, new ArrayList<>());
        if (students.isEmpty()) {
            System.out.println("No students present.");
        } else {
            for (String student : students) {
                System.out.println(student);
            }
        }
        System.out.println("Total present in " + subject + ": " + students.size());
    }
    
    public void displayAllAttendance() {
        System.out.println("=== All Subjects Attendance ===");
        if (attendanceMap.isEmpty()) {
            System.out.println("No attendance recorded yet.");
            return;
        }
        for (String subject : attendanceMap.keySet()) {
            displayAttendanceForSubject(subject);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Smart Classroom Attendance Tracker ===");
        AttendanceTracker tracker = new AttendanceTracker();
        tracker.markAttendance("Mathematics", "Alice");
        tracker.markAttendance("Mathematics", "Bob");
        tracker.markAttendance("Physics", "Alice");
        tracker.markAttendance("Mathematics", "Alice"); // Duplicate
        
        System.out.println();
        tracker.displayAllAttendance();
    }
}
