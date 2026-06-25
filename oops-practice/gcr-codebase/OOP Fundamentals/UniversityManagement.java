public class UniversityManagement {
    static class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;

        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        public double getCGPA() {
            return CGPA;
        }

        public void setCGPA(double CGPA) {
            this.CGPA = CGPA;
        }
    }

    static class PostgraduateStudent extends Student {
        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
        }

        public void displayDetails() {
            System.out.println("Roll Number (public): " + rollNumber);
            System.out.println("Name (protected): " + name);
            System.out.println("CGPA (private accessed via getter): " + getCGPA());
        }
    }

    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "David", 3.8);
        pgStudent.displayDetails();
        
        System.out.println("\nUpdating CGPA...");
        pgStudent.setCGPA(3.9);
        pgStudent.displayDetails();
    }
}
