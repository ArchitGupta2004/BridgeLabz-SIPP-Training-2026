import java.util.Arrays;
import java.util.Comparator;

public class EmployeeAttendanceRanking {
    static class Employee {
        int id;
        int attendance;

        Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int k = 3;
        
        System.out.println("Employee IDs: " + Arrays.toString(employeeIds));
        System.out.println("Attendance:   " + Arrays.toString(attendance));
        
        int[] result = getTopKEmployees(employeeIds, attendance, k);
        System.out.println("Top " + k + " Employees: " + Arrays.toString(result));
    }

    public static int[] getTopKEmployees(int[] employeeIds, int[] attendance, int k) {
        int n = employeeIds.length;
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }
        
        // Sort based on attendance descending, then ID ascending
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.attendance != e2.attendance) {
                    return Integer.compare(e2.attendance, e1.attendance); // Descending attendance
                } else {
                    return Integer.compare(e1.id, e2.id); // Ascending ID
                }
            }
        });
        
        int[] topKIds = new int[k];
        for (int i = 0; i < k; i++) {
            topKIds[i] = employees[i].id;
        }
        
        return topKIds;
    }
}
