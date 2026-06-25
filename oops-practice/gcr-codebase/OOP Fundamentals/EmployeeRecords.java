public class EmployeeRecords {
    static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    static class Manager extends Employee {
        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        public void displayManagerDetails() {
            System.out.println("Employee ID (public): " + employeeID);
            System.out.println("Department (protected): " + department);
            System.out.println("Salary (private accessed via getter): $" + getSalary());
        }
    }

    public static void main(String[] args) {
        Manager mgr = new Manager(505, "IT", 90000.0);
        mgr.displayManagerDetails();
        
        System.out.println("\nUpdating Salary...");
        mgr.setSalary(95000.0);
        mgr.displayManagerDetails();
    }
}
