package org.ironschool;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private boolean isEnrolled;
    private List<Course> courses;

    public Student(String personalName, String email, String address) {
        super(personalName, email, address);
        setEnrolled(false);
        courses = new ArrayList<>();
    }

    /*
private List<Person> personList;
public PersonsList(){
personList = new ArrayList<>();}
inicializar las List<> en el constructor como ArrayList
 */

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
        this.courses.add(course);
    }

    public String getName() {
        return super.getPersonalName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "isEnrolled=" + isEnrolled +
                ", courses=" + courses +
                ", name=" + getPersonalName() +
                ", email=" + getEmail() +
                ", address=" + getAddress() +
                '}';
    }
}
