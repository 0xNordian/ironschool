package org.ironschool;


import java.util.ArrayList;
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
        students = new ArrayList<Student>();
        this.courseRevenue = 0;
        setCourseId();
    }
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
        if (courseName.isBlank()){
            throw new IllegalArgumentException("Course's name cannot be empty or blank");
        }
       courseName=courseName.trim();
        courseName=courseName.substring(0,1).toUpperCase() + courseName.substring(1).toLowerCase();
        this.courseName= courseName;
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

    public void setStudents(Student students) {
        this.students.add(students);
        //when enroll call curso per student
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        //no puede ser negativo
        this.price = price;
    }

    public double getCourseRevenue() {
        return courseRevenue;
    }

    public void setCourseRevenue() {
        //CourseRevenue +=
        //enroll student, then call setCourseRevenue.
        this.courseRevenue += price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + courseName + '\'' +
                ", price=" + price +
                '}';
    }

}
