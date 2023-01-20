package org.ironschool;
import java.util.List;

public class Student extends Person{
    private boolean isEnrolled;
    private List<Course> courses;

    public Student(String personalName, String email, String address) {
        super(personalName, email, address);
        setEnrolled(false);
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        //añadir curso a la lista
        this.courses = courses;
    }
}
