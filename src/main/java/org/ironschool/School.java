package org.ironschool;
import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Student> students;
    private double schoolRevenue;
    private double expenses;
    private double profits;

    public School() {
        setSchoolName(schoolName);
        this.schoolRevenue=0.;
        this.expenses=0.;
        this.profits=0.;
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
       if (schoolName.isBlank()){
           throw new IllegalArgumentException("Scholl name cannot be empty or blank");
       }
       String newSchoolName= schoolName.trim();
       newSchoolName=newSchoolName.substring(0,1).toUpperCase() + newSchoolName.substring(1).toLowerCase();
       this.schoolName=newSchoolName;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        this.courses.add(course);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public double getSchoolRevenue() {
        return schoolRevenue;
    }

    public void setSchoolRevenue(double schoolRevenue) {
        if (schoolRevenue<0){
            throw new IllegalArgumentException("Revenue cannot be negative");
        } else {
            this.schoolRevenue += schoolRevenue;
        }
    }

    public double getExpenses() {
        setExpenses();
        return expenses;
    }

    public void setExpenses() {
        double sumSalary=0;
        for (Teacher t: teachers){
            sumSalary+=t.getSalary();
        }
        this.expenses=sumSalary;
    }

    public double getProfits() {
        setProfits();
        return profits;
    }

    private void setProfits() {
        this.profits= this.schoolRevenue-this.expenses;
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
