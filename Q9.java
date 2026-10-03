import java.util.*;

class Course {
    private String courseName;
    private String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name +
               " Course: " + enrolledCourse.getCourseName() +
               " (" + enrolledCourse.getDuration() + ")";
    }
}

class PremiumStudent extends Student {
    private double discount;

    public PremiumStudent(String name, Course enrolledCourse,
                          double discount) {

        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name +
               " Course: " + enrolledCourse.getCourseName() +
               " (" + enrolledCourse.getDuration() + ")" +
               " Discount: " + discount + "%";
    }
}

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] courseData = sc.nextLine().split(",");

        Course course = new Course(
                courseData[0].trim(),
                courseData[1].trim()
        );

        String[] studentData = sc.nextLine().split(",");

        Student student = new Student(
                studentData[0].trim(),
                course
        );

        String[] premiumData = sc.nextLine().split(",");

        PremiumStudent premiumStudent = new PremiumStudent(
                premiumData[0].trim(),
                course,
                Double.parseDouble(premiumData[2].trim())
        );

        System.out.println(student);
        System.out.println(premiumStudent);

        sc.close();
    }
}