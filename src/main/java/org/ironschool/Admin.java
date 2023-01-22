package org.ironschool;

import java.util.Scanner;


public class Admin {
    private static String schoolName;

    //SCHOOL
    public static void createSchoolName(String schoolName) {
        if(schoolName.trim().equals("")){
            throw new IllegalArgumentException("The School Name cannot remain empty");
        }
        String[] words = schoolName.trim().split(" ");
        StringBuilder modifiedString = new StringBuilder();
        for (String word : words) {
            modifiedString.append(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ");
        }
        Admin.schoolName = modifiedString.toString().trim();

    }
    public static String getSchoolName() {
        return schoolName;
    }

    public static void searchTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name or email of the teacher you want to search: ");
        String input = sc.nextLine();
        boolean found = false;
        Teacher[] teachers = new Teacher[0];
        for (Teacher teacher : teachers) {
            if (teacher.getName().equalsIgnoreCase(input) || teacher.getEmail().equalsIgnoreCase(input)) {
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

}