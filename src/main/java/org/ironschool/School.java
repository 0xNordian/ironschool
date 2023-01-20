package org.ironschool;
import java.util.List;

public class School {
    private String schoolName;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Student> students;
    private double schoolRevenue;
    private double expenses;
    private double profits;

    public School(String schoolName) {
        setSchoolName(schoolName);
        this.schoolRevenue=0.;
        this.expenses=0.;
        this.profits=0.;
    }
/*
private List<Person> personList;
public PersonsList(){
personList = new ArrayList<>();}
inicializar las List<> en el constructor como ArrayList
 */

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        //String !empty !blank
        //standard format: Trim whitespace & First capital letter
        this.schoolName = schoolName;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        //should be ArrayList & step1/1
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        //añadir curso a la lista
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        //añadir student a la lista
    }

    public double getSchoolRevenue() {
        return schoolRevenue;
    }

    public void setSchoolRevenue(double schoolRevenue) {
        //no puede ser negativo
        this.schoolRevenue = schoolRevenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        //no puede ser negativo
        this.expenses = expenses;
    }

    public double getProfits() {
        return profits;
    }

    public void setProfits(double profits) {
        this.profits = profits;
    }
}
