package org.ironschool;

public abstract class Admin {


    public static void enroll(School school,String idstudent, String idcourse) {
        Student student = school.getStudentIds().get(idstudent);
        Course course = school.getCourseIds().get(idcourse);

        student.setCourses(course);
        student.setEnrolled(true);
        course.setStudents(student);
        course.setCourseRevenue();
    }

    //public static void assign(Teacher teacher, Course course){ }

    //public static void show(School school, String whatToShow){
    // String findAll = whatToShow;
    // switch(findAll){
    //      case Student:
    //          sysout() School.getStudents()
    //      case Course:

    //      case Teacher:
    //schoolbaba.getStudents()

    //  }
    // }

    public static void lookup(School school, LookupType type, String id) {
        switch (type) {
            case COURSE -> {
                Course resultCourse = school.getCourseIds().get(id);
                System.out.println(resultCourse.toString());
            }
            case STUDENT -> {
                Student resultStudent = school.getStudentIds().get(id);
                System.out.println(resultStudent.toString());
            }
            case TEACHER -> {
                Teacher resultTeacher = school.getTeacherIds().get(id);
                System.out.println(resultTeacher.toString());
            }
        }
    }


    //public static showProfit(School school){
    // school.setSchoolRevenue();
    // school.setExpenses();
    // school.setProfit();
    // return school.getProfits}
}