package org.ironschool;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class Menu {
        private static Scanner sc = new Scanner(System.in);

        public static void menuStart() {
            // Create a new school
            System.out.println("Please enter a name for the school: ");
            String schoolName = sc.nextLine();
            School school = new School(schoolName); //school
            //Admin.createSchoolName(schoolName);
            System.out.println("School Name:" + school.getSchoolName());

            // Create teachers
            System.out.println("Please enter the number of teachers to be created: ");
            int numberOfTeachers = sc.nextInt();
            sc.nextLine();
            //List<Teacher> teachers = new ArrayList<>();
            Teacher teacher = null;
            for (int i = 0; i < numberOfTeachers; i++) {
                System.out.println("Please enter the teacher's name " + (i + 1) + ": ");
                String teacherName = sc.nextLine();
                System.out.println("Please enter the teacher's email " + (i + 1) + ": ");
                String teacherEmail = sc.nextLine();
                System.out.println("Please enter the teacher's address " + (i + 1) + ": ");
                String teacherAddress = sc.nextLine();
                System.out.println("Please enter the teacher's salary " + (i + 1) + ": ");
                double salary = sc.nextDouble();
                sc.nextLine();
                teacher = new Teacher(teacherName, teacherEmail, teacherAddress, salary);
                school.setTeachers(teacher);
                school.setTeacherIds(teacher); // creates hashmap of <TeacherId, Teacher>
                //teachers.add(teacher);
            }
            //school.setExpenses() <-- calculate
            int index = 0;
            for (Teacher teacherDetail : school.getTeachers()) {
                System.out.println("Teacher " + (index + 1) + " name: " + teacherDetail.getName());
                System.out.println("Teacher " + (index + 1) + " email: " + teacherDetail.getEmail());
                System.out.println("Teacher " + (index + 1) + " address: " + teacherDetail.getAddress());
                System.out.println("Teacher " + (index + 1) + " salary: " + teacherDetail.getSalary());
                index++;
            }

            // Create courses
            System.out.println("Please enter the number of courses to be created: ");
            int numberOfCourses = sc.nextInt();
            sc.nextLine();
            //List<Course> courses = new ArrayList<>();
            for (int i = 0; i < numberOfCourses; i++) {
                System.out.println("Please enter the name of course " + (i + 1) + ": ");
                String name = sc.nextLine();
                System.out.println("Please enter the course price " + (i + 1) + ": ");
                double price = sc.nextDouble();
                sc.nextLine();
                Course course = new Course(name, price);
                //courses.add(course);
                school.setCourses(course);
                school.setCourseIds(course); // creates hashmap of <CourseId, Course>
            }

                index = 0;
            for (Course courseDetails : school.getCourses()) {
                System.out.println("Course " + (index + 1) + " name: " + courseDetails.getCourseName());
                System.out.println("Course " + (index + 1) + " price: " + courseDetails.getPrice());
                System.out.println("Course ID: " + courseDetails.getCourseId());
                index++;
            }

            //STUDENTS
            System.out.println("Please enter the number of students to be created: ");
            int numberOfStudents = sc.nextInt();
            sc.nextLine();
            //List<Student> students = new ArrayList<>();
            Student student = null;
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Please enter the student name " + (i + 1) + ": ");
                String studentName = sc.nextLine();
                System.out.println("Please enter the student email " + (i + 1) + ": ");
                String studentEmail = sc.nextLine();
                System.out.println("Please enter the student address " + (i + 1) + ": ");
                String studentAddress = sc.nextLine();
                student = new Student(studentName, studentEmail, studentAddress);
                //students.add(student);
                school.setStudents(student); // creates List<>
                school.setStudentIds(student); // creates hashmap of <StudentId, Student>
            }

                index = 0;
            for (Student studentDetail : school.getStudents()) {
                System.out.println("Student " + (index + 1) + " name: " + studentDetail.getName());
                System.out.println("Student " + (index + 1) + " email: " + studentDetail.getEmail());
                System.out.println("Student " + (index + 1) + " address: " + studentDetail.getAddress());
                System.out.println("Student " + (index + 1) + " id: " + studentDetail.getPersonalId());
            }

            System.out.println("Please enter the name or email of the teacher you want to search: ");
            String searchQuery = sc.nextLine();
            //sc.nextLine();
            school.searchTeacher(searchQuery);

            while (true) {
                System.out.println("Enter command:");
                String command = sc.nextLine();
                String[] parts = command.split(" ");
                String action = parts[0];
                switch (action) {
                    case "ENROLL":
                        if (parts.length == 3) {
                            String studentId = parts[1];
                            String courseId = parts[2];
                           // Student student2 = school.getStudentById(studentId);
                           // Course course2 = school.getCourseById(courseId);
                            if (student2 != null && course2 != null) {
                                Admin.enroll(school, studentId, courseId);
                                //System.out.println("HERE WE CALL THE ENROLL METHOD IN ADMIN");
                                //student2.Admin.enroll(course);
                                System.out.println("Student " + student2.getName() + " has been enrolled in " + course2.getCourseName() + ".");
                            } else {
                                System.out.println("Invalid student or course ID.");
                            }
                        } else {
                            System.out.println("Invalid command format. Use ENROLL [STUDENT_ID] [COURSE_ID].");
                        }
                        break;
                    case "ASSIGN":
                        if (parts.length == 3) {
                            String teacherId = parts[1];
                            String courseId = parts[2];
                            //Teacher teacher3 = school.getTeacherById(teacherId);
                            Teacher teacher3 = school.getTeacherIds().get(teacherId); //finds in hashmap, doesn't need a method
                            //Course course3 = school.getCourseById(courseId);
                            Course course3 = school.getCourseIds().get(courseId); //finds in hashmap, doesn't need a method
                            if (teacher3 != null && course3 != null) {
                                System.out.println("HERE WE CALL THE ASSIGN METHOD IN ADMIN");
                                //teacher2.assign(course);
                                System.out.println("Teacher " + teacher3.getName() + " has been assigned to " + course3.getCourseName() + ".");
                            } else {
                                System.out.println("Invalid teacher or course ID.");
                            }
                        } else {
                            System.out.println("Invalid command format. Use ASSIGN [TEACHER_ID] [COURSE_ID].");
                        }
                        break;
                    // existing code
                }
            }

        }
}