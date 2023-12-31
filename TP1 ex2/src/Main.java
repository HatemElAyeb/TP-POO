import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(1, "ISSAM", "ALLANI");
        Instructor instructor2 = new Instructor(2, "LILIA", "SFAXI");
        Course course = new Course(101, "POO", instructor);
        Course course2 = new Course(150, "SE", instructor2);
        Student student = new Student(1001, "Hatem", "El Ayeb");
        student.enroll(course);
        student.enroll(course2);
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Enrolled Courses: ");
        for (Course enrolledCourse : student.getCourses()) {
            System.out.println(" - " + enrolledCourse.getCourseName()+"("+enrolledCourse.getCourseId() +")"+ " (Instructor: " +
                    enrolledCourse.getInstructor().getFirstName() + " " +
                    enrolledCourse.getInstructor().getLastName() + ")");
        }
    }
}