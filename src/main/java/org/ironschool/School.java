package org.ironschool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
    private String schoolName;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Student> students;
    private HashMap<String, Student> studentIds;
    private HashMap<String, Course> courseIds;
    private HashMap<String, Teacher> teacherIds;
    private double schoolRevenue;
    private double expenses;
    private double profits;

    public School(String schoolName) {
        setSchoolName(schoolName);
        this.schoolRevenue=0.;
        this.expenses=0.;
        this.profits=0.;
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        students = new ArrayList<>();
        studentIds = new HashMap<String, Student>();
        courseIds = new HashMap<String, Course>();
        teacherIds = new HashMap<String, Teacher>();
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

    public void setSchoolRevenue() {
        double sum = 0;
        for(Course c : this.courses){
            int studentsEnrolled = c.getStudents().size();
            double revenue = studentsEnrolled * c.getPrice();
            sum += c.getCourseRevenue();
        }
        this.schoolRevenue = sum;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses() {
        double sum =0;
        for ( Teacher t : this.teachers) {
            int teachersAssigned = this.teachers.size();
          double payment = teachersAssigned * t.getSalary();
          sum += payment;

        }
        this.expenses = sum;

    }

    public double getProfits() {
        return profits;
    }

    public void setProfits() {
        //this.profits= profits i passo parametre double
        this.profits = this.schoolRevenue - this.expenses;
    }

    public HashMap<String, Student> getStudentIds(){return this.studentIds;}
    public void setStudentIds(Student student) {
            this.studentIds.put(student.getPersonalId(), student);
    }
    public HashMap<String, Course> getCourseIds(){return this.courseIds;}
    public void setCourseIds(Course course) {
        this.courseIds.put(course.getCourseId(), course);
    }
    public HashMap<String, Teacher> getTeacherIds(){return this.teacherIds;}
    public void setTeacherIds(Teacher teacher) {
        this.teacherIds.put(teacher.getPersonalId(), teacher);
    }
    public void searchTeacher(String nameOrEmail) {
        boolean found = false;
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
//    public Student getStudentById(String studentId) {
//        for (Student student : students) {
//            if (student.getPersonalId().equals(studentId)) {
//                return student;
//            }
//        }
//        return null;
//    }

//    public Course getCourseById(String courseId) {
//        for (Course course : courses) {
//            if (course.getCourseId().equalsIgnoreCase(courseId)) {
//                return course;
//            }
//        }
//        return null;
//    }

//    public Teacher getTeacherById(String teacherId) {
//        for (Teacher teacher : teachers) {
//            if (teacher.getPersonalId().equals(teacherId)) {
//                return teacher;
//            }
//        }
//        return null;
//    }
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

