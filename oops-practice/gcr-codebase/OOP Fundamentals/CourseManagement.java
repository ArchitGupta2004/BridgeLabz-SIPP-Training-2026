public class CourseManagement {
    static class Course {
        String courseName;
        String duration;
        double fee;
        static String instituteName = "Default Institute";

        public Course(String courseName, String duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        public void displayCourseDetails() {
            System.out.println("Institute: " + instituteName);
            System.out.println("Course: " + courseName + ", Duration: " + duration + ", Fee: $" + fee);
        }

        public static void updateInstituteName(String newName) {
            instituteName = newName;
        }
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", "3 Months", 500.0);
        Course c2 = new Course("Web Development", "6 Months", 800.0);

        c1.displayCourseDetails();
        
        System.out.println("\nUpdating Institute Name...\n");
        Course.updateInstituteName("Tech Academy");
        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
