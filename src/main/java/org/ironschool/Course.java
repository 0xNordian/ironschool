package org.ironschool;


import java.util.List;
import java.util.UUID;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> students;
    private double price;
    private double courseRevenue;

    public Course(String courseName, double price) {
        setCourseName(courseName);
        setPrice(price);
    }
    /*
private List<Person> personList;
public PersonsList(){
personList = new ArrayList<>();}
inicializar las List<> en el constructor como ArrayList
 */


    public String getCourseId() {
        return courseId;
    }

    private void setCourseId() {
       this.courseId = UUID.randomUUID().toString();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        //Trim whitespace & blank
        //standard format: Trim whitespace
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        //añadir student a la lista
        this.students = students;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //no puede ser negativo
        this.price = price;
    }

    public double getCourseRevenue() {
        return courseRevenue;
    }

    public void setCourseRevenue(double courseRevenue) {
        //CourseRevenue +=
        this.courseRevenue = courseRevenue;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                ", price=" + price +
                ", courseRevenue=" + courseRevenue +
                '}';
    }
}
