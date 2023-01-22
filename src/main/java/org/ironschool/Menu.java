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
            School school = new School(schoolName);
            Admin.createSchoolName(schoolName);
            System.out.println("School Name:" + School.getSchoolName());

            // Create teachers
            System.out.println("Please enter the number of teachers to be created: ");
            int numberOfTeachers = sc.nextInt();
            sc.nextLine();
            List<Teacher> teachers = new ArrayList<>();
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
                teachers.add(teacher);
            }
            school.setTeachers(teachers);
            //System.out.println("Teacher: " + school.getTeachers());
            teachers = school.getTeachers();
            int index = 0;
            for (Teacher teacherDetail : teachers) {
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
            List<Course> courses = new ArrayList<>();
            for (int i = 0; i < numberOfCourses; i++) {
                System.out.println("Please enter the name of course " + (i + 1) + ": ");
                String name = sc.nextLine();
                System.out.println("Please enter the course price " + (i + 1) + ": ");
                double price = sc.nextDouble();
                Course course = new Course(name, price);
                courses.add(course);
            }
            school.setCourses(courses);
            //System.out.println("Course: " + school.getCourses());
            courses = school.getCourses();
            for (Course courseDetails : courses) {
                index = 0;
                System.out.println("Course " + (index + 1) + " name: " + courseDetails.getCourseName());
                System.out.println("Course " + (index + 1) + " price: " + courseDetails.getPrice());
                index++;
            }

            /*
            // Create students
            System.out.println("Please enter the number of students to be created: ");
            int numberOfStudents = getValidIntInput();
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Please enter the name of student " + (i + 1) + ": ");
                String name = getValidStringInput();
                System.out.println("Please enter the age of student " + (i + 1) + ": ");
                int age = getValidIntInput();
                Student student = new Student(name, age);
                students.add(student);
            }
            school.setStudents(students);

            // Show command options
            System.out.println("Please enter a command to execute a specified action in the system: ");
            System.out.println("1. Assign a teacher to a course");
            System.out.println("2. Assign a student to a course");
            System.out.println("3. Show all teachers in the school");
            System.out.println("4. Show all courses in the school");
            System.out.println("5. Show all students in the school");

             */
        }
    }



