package org.ironschool;
import java.util.ArrayList;
import java.util.List;

public class School {
    private static String schoolName;
    static List<Teacher> teachers;
    private List<Course> courses;
    private List<Student> students;
    private double schoolRevenue;
    private double expenses;
    private double profits;

    public School(String schoolName) {
        setSchoolName(schoolName);
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
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

    public static String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        //String !empty !blank
        //standard format: Trim whitespace & First capital letter
        this.schoolName = schoolName;
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        //should be ArrayList & step1/1
        this.teachers = teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        //añadir curso a la lista
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> student) {
        //añadir student a la lista
        this.students = student;
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

    public static void searchTeacher(String nameOrEmail) {
        boolean found = false;
        List<Teacher> teachers = School.getTeachers();
        for (Teacher teacher : teachers) {
            if (teacher.getName().equalsIgnoreCase(nameOrEmail) || teacher.getEmail().equalsIgnoreCase(nameOrEmail)) {
                System.out.println("Teacher found:");
                System.out.println("Name: " + teacher.getName());
                System.out.println("Email: " + teacher.getEmail());
                System.out.println("Address: " + teacher.getAddress());
                System.out.println("Salary: " + teacher.getSalary());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Teacher not found");
        }
    }


    @Override
    public String toString() {
        return "School{" +
                "teachers=" + teachers +
                ", courses=" + courses +
                ", students=" + students +
                ", schoolRevenue=" + schoolRevenue +
                ", expenses=" + expenses +
                ", profits=" + profits +
                '}';
    }
}
