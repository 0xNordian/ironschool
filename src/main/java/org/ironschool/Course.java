package org.ironschool;


import java.util.UUID;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private Student[] students;
    private double price;
    private double courseRevenue;

    public Course(String courseName, double price) {
        setCourseName(courseName);
        setPrice(price);
    }


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId() {
       this.courseId = UUID.randomUUID().toString();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCourseRevenue() {
        return courseRevenue;
    }

    public void setCourseRevenue(double courseRevenue) {
        this.courseRevenue = courseRevenue;
    }
}
