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

    public static void show ( School school, LookupType type) {
        switch (type) {
            case STUDENT -> System.out.println(school.getStudentIds().values());
            case COURSE -> System.out.println(school.getCourseIds().values());
            case TEACHER -> System.out.println(school.getTeacherIds().values());
        }
    }

    public static void lookup(School school, LookupType type, String id){
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