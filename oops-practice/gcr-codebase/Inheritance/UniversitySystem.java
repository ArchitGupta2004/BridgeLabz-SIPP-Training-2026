class Person {
    String name;
    public Person(String name) { this.name = name; }
    @Override
    public String toString() { return "Person [Name=" + name + "]"; }
}

class Student extends Person {
    final int studentId;
    double GPA;
    public Student(String name, int studentId, double GPA) {
        super(name);
        this.studentId = studentId;
        this.GPA = GPA;
    }
    @Override
    public String toString() { return super.toString() + ", Student [ID=" + studentId + ", GPA=" + GPA + "]"; }
}

class GradStudent extends Student {
    String thesis;
    public GradStudent(String name, int studentId, double GPA, String thesis) {
        super(name, studentId, GPA);
        this.thesis = thesis;
    }
    @Override
    public String toString() { return super.toString() + ", GradStudent [Thesis=" + thesis + "]"; }
}

public class UniversitySystem {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent("Alice", 101, 3.8, "AI in Healthcare");
        System.out.println(gs.toString());
        // Demonstrate IS-A
        System.out.println("Is gs a Student? " + (gs instanceof Student));
        System.out.println("Is gs a Person? " + (gs instanceof Person));
    }
}
