package org.ironschool;

public class Student extends Person{
    private boolean isEnrolled;
    private Course[] courses;

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

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
