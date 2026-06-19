import java.util.*;
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}

public class EmployeeSkillAssignment {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Dept: ");
        String dept = sc.next();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, dept, salary);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
        oos.writeObject(emp);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"));
        Employee rec = (Employee) ois.readObject();
        ois.close();

        System.out.println("Recovered: " + rec);
    }
}
