import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String title;
    public CourseType(String title) { this.title = title; }
    public String getTitle() { return title; }
    @Override public String toString() { return title; }
}

class ExamCourse extends CourseType { public ExamCourse(String title) { super(title); } }
class AssignmentCourse extends CourseType { public AssignmentCourse(String title) { super(title); } }
class ResearchCourse extends CourseType { public ResearchCourse(String title) { super(title); } }

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    public void addCourse(T course) { courses.add(course); }
    public List<T> getCourses() { return courses; }
}

public class CourseSystem {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("- " + course.getTitle() + " (" + course.getClass().getSimpleName() + ")");
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics 101"));
        examCourses.addCourse(new ExamCourse("Physics 201"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));

        System.out.println("Exam Courses:");
        displayCourses(examCourses.getCourses());

        System.out.println("\nResearch Courses:");
        displayCourses(researchCourses.getCourses());
    }
}
