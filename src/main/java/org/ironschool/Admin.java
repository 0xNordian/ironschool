package org.ironschool;


import java.sql.SQLOutput;

public abstract class Admin {




    public static void enroll(Student student, Course course){
        student.setCourses(course); //add course to student courses (List<Course>)
        student.setEnrolled(true); //set isEnrolled to true
        course.setStudents(student); //add student to course students (List<Student>)
        course.setCourseRevenue(); //update course revenue by course price
    }
    //public static void assign(Teacher teacher, Course course){}

    public static void show ( School school, LookupType type, String id){
        switch (type) {
            case STUDENT -> System.out.println(school.getStudents());
            case COURSE -> System.out.println(school.getCourses());
            case TEACHER -> System.out.println(school.getTeachers());
        }
    }

    public static void show(School school, String findBy){
     if(findBy.equals("student")||findBy.equals("course")||findBy.equals("teacher")) {
         switch (findBy) {
             case "student" -> System.out.println(school.getStudents());
             case "course" -> System.out.println(school.getCourses());
             case "teacher" -> System.out.println(school.getTeachers());
         }

    }

    //public static void lookupStudent(id){
        // **search and return student with given id}
    //public static void lookupCourse(id){}
    //public static void lookupTeacher(id){}

    //public static showProfit(School school){
    // school.setSchoolRevenue();
    // school.setExpenses();
    // school.setProfit();
    // return school.getProfits}



//    private static String schoolName;
//
//    //SCHOOL
//    public static void createSchoolName(String schoolName) {
//        if(schoolName.trim().equals("")){
//            throw new IllegalArgumentException("The School Name cannot remain empty");
//        }
//        String[] words = schoolName.trim().split(" ");
//        StringBuilder modifiedString = new StringBuilder();
//        for (String word : words) {
//            modifiedString.append(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ");
//        }
//        Admin.schoolName = modifiedString.toString().trim();
//
//    }
//    public static String getSchoolName() {
//        return schoolName;
//    }
}