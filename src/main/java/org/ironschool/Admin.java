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

    public static void assign (School school, String teacherId, String courseId){
        Teacher teacher = school.getTeacherIds().get(teacherId);
        Course course = school.getCourseIds().get(courseId);

        teacher.setCourses(course);
        teacher.setAssigned(true);
        course.setTeacher(teacher);
    }




    public static void show ( School school, LookupType type) {
        switch (type) {
            //case STUDENT -> System.out.println(school.getStudentIds().values());
            case STUDENT:
                for (Student student : school.getStudentIds().values()) {
                    System.out.println("Student Name: " + student.getPersonalName());
                    System.out.println("Student Email: " + student.getEmail());
                    System.out.println("Student Address: " + student.getAddress());
                }
                break;
            case COURSE:
                for (Course course : school.getCourseIds().values()) {
                    System.out.println("Course Name: " + course.getCourseName());
                    System.out.println("Course Price: " + course.getPrice());
                }
                break;
            case TEACHER:
                for (Teacher teacher : school.getTeacherIds().values()) {
                    System.out.println("Teacher Name: " + teacher.getPersonalName());
                    System.out.println("Teacher Email: " + teacher.getEmail());
                    System.out.println("Teacher Address: " + teacher.getAddress());
                    System.out.println("Teacher Salary: " + teacher.getSalary());
                }
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


    public static void showProfit(School school){
    school.setSchoolRevenue();
    school.setExpenses();
    school.setProfits();
    System.out.println(school.getSchoolName() + "profits are: " + school.getProfits() );


    }

    public static void showRevenue(School school){
        school.setSchoolRevenue();
        System.out.println(school.getSchoolRevenue());

    }
    public static void showExpenses(School school){
        school.setExpenses();
        System.out.println(school.getExpenses());
    }


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
    //public static showProfit(School school){
    // school.setSchoolRevenue();
    // school.setExpenses();
    // school.setProfit();
    // return school.getProfits}
}