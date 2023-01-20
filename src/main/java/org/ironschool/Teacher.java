package org.ironschool;

public class Teacher extends Person{
    private boolean isAssigned;
    private Course[] courses;

    public Teacher(String personalName, String email, String address) {
        super(personalName, email, address);
        setAssigned(false);
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
