abstract class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.monthlySalary = salary;
    }

    public double getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hours) { this.hoursWorked = hours; }
    
    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double rate) { this.hourlyRate = rate; }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee ftEmp = new FullTimeEmployee(101, "Alice", 5000.0);
        PartTimeEmployee ptEmp = new PartTimeEmployee(102, "Bob", 40, 20.0);

        System.out.println("--- Full-Time Employee ---");
        ftEmp.displayEmployeeInfo();
        System.out.println("Calculated Salary: $" + ftEmp.calculateSalary());

        System.out.println("\n--- Part-Time Employee ---");
        ptEmp.displayEmployeeInfo();
        System.out.println("Calculated Salary: $" + ptEmp.calculateSalary());
    }
}
