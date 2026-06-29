class Course {
    String courseName;
    String duration;
    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public void showCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration);
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("Java Mastery", "6 Months", "Udemy", true, 99.99, 20.0);
        c.showCourseDetails();
    }
}
